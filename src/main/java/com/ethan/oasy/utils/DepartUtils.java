package com.ethan.oasy.utils;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.DepartmentDetails;
import com.ethan.oasy.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-03-31 19:35
 */
@Component //把普通Java类实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
public class DepartUtils {

    @Autowired
    private DepartmentService departmentService;
    private static DepartUtils departUtils; //把普通Java类实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>

    @PostConstruct  //关键二   通过@PostConstruct 和 @PreDestroy 方法 实现初始化和销毁bean之前进行的操作
    public void init() {
        departUtils = this;
        departUtils.departmentService = this.departmentService; //// 初使化时将已静态化的testService实例化
    }

    /**
     * 树形化部门
     * @param list
     * @return
     */
    public List<DepartmentDetails> treeDepartment(List<DepartmentDetails> list){
        List<DepartmentDetails> departments = new ArrayList<>();
        if (list.size() == 0){
            return list;
        }

        walkDepartmentTreeList(list,"&nbsp&nbsp",departments);
        return departments;
    }

    /**
     * 遍历所有部门树
     * @param tops
     * @param list
     */
    public static void walkDepartmentTreeList(List<DepartmentDetails> tops,String prefix,List<DepartmentDetails> list){
        for (DepartmentDetails top: tops) {  //顶层部门是否有
            top.setDepartName(prefix + top.getDepartName());
            list.add(top);
            walkDepartmentTreeList(departUtils.departmentService.findChildDepartment(top.getDepartId()),"&nbsp&nbsp"+prefix,list);
        }
    }

    /**
     * 递归删除部门
     * @param departId
     * @return
     */
    public void deletePartment(String departId) throws Exception{
        walkDepartmentTreeDelete(departUtils.departmentService.findDepartByIdToList(departId));
    }

    public static void walkDepartmentTreeDelete(List<DepartmentDetails> tops) throws  Exception{
        for (DepartmentDetails top: tops) {  //顶层部门是否有
            departUtils.departmentService.deleteDepart(top.getDepartId());
            walkDepartmentTreeDelete(departUtils.departmentService.findChildDepartment(top.getDepartId()));
        }
    }


}
