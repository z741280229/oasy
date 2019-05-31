<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<!-- begin row -->
<div class="row">
    <!-- begin col-12 -->
    <div class="col-md-12">
        <!-- begin panel -->
        <div class="panel panel-inverse">
            <div class="panel-heading">
                <h4 class="panel-title">起草审批</h4>
            </div>
            <div class="panel-body">
                <table style="width: 80%;" align="center">
                    <tr>
                        <td colspan="8" align="center"><h2>转正申请单</h2></td>
                    </tr>
                    <tr style="height: 2%">
                        <td colspan="4" style="border:none">编号</td>
                        <td colspan="4" style="border:none;" align="right">申请日期:<input type="date"/></td>
                    </tr>
                </table>

                <table style="width: 80%;height: 70%" align="center" border="1px">
                    <tr align="center">
                        <td bgcolor="#dcdcdc">姓名</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">性别</td>
                        <td>
                            <select style="width: 100%;height: 100%"><option>请选择</option></select>
                        </td>
                        <td bgcolor="#dcdcdc">入职日期</td>
                        <td><input type="date" style="width: 100%;height: 100%"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">分配部门</td>
                        <td>
                            <select style="width: 100%;height: 100%"><option>请选择</option></select>
                        </td>

                        <td bgcolor="#dcdcdc">拟聘岗位</td>
                        <td>
                            <select style="width: 100%;height: 100%"><option>请选择</option></select>
                        </td>
                        <td bgcolor="#dcdcdc">员工类型</td>
                        <td>
                            <select style="width: 100%;height: 100%"><option>请选择</option></select>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">毕业院校</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">学历</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">专业</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">毕业时间</td>
                        <td><input type="date" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">实习截止日</td>
                        <td><input type="date" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">实用截止日</td>
                        <td><input type="date" style="width: 100%;height: 100%"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">原单位</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">户口所在地</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">私人邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">办公电话</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">移动电话</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                        <td bgcolor="#dcdcdc">公司邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%"></td>
                    </tr>



                    <tr align="center" >
                        <td bgcolor="#dcdcdc">住址</td>
                        <td colspan="5"><input type="text" style="width: 100%;height: 100%"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">准备</td>
                        <td colspan="2">
                            工号：<input type="text" >
                        </td>
                        <td colspan="3">
                            OA账号：<input type="text" >
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">个人简介</td>
                        <td colspan="5" align="left">
                            <input type="file">
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">成本信息</td>
                        <td colspan="5">
                            <table style="width: 100%;height: 100%" border="1px">
                                <tr>
                                    <td>工资开户行</td>
                                    <td><input type="text" style="width: 100%;height: 100%"></td>
                                    <td>工资账号</td>
                                    <td><input type="text" style="width: 100%;height: 100%"></td>
                                </tr>
                                <tr>
                                    <td>社保缴纳地</td>
                                    <td><input type="text" style="width: 100%;height: 100%"></td>
                                    <td>社保号</td>
                                    <td><input type="text" style="width: 100%;height: 100%"></td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <input type="radio" value="">劳动合同/保密协议书
                                        <input type="radio" value="">签字的《公司员工手册》
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr align="center" >
                        <td bgcolor="#dcdcdc">审批人意见</td>
                        <td colspan="7"><textarea style="height: 100%;width: 100%"></textarea></td>
                    </tr>


                </table>


                <table style="width: 80%" align="center">
                    <tr align="right" >
                        <td colspan="8" ><input type="button" class="btn btn-primary" value="提交"/></td>
                    </tr>
                </table>
            </div>
        </div>
        <!-- end panel -->
    </div>
    <!-- end col-12 -->
</div>
<!-- end row -->
