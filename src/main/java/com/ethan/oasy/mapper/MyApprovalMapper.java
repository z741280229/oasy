package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.MyApproval;
import com.ethan.oasy.pojo.MyApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyApprovalMapper {
    int countByExample(MyApprovalExample example);

    int deleteByExample(MyApprovalExample example);

    int deleteByPrimaryKey(Integer myapId);

    int insert(MyApproval record);

    int insertSelective(MyApproval record);

    List<MyApproval> selectByExample(MyApprovalExample example);

    MyApproval selectByPrimaryKey(Integer myapId);

    int updateByExampleSelective(@Param("record") MyApproval record, @Param("example") MyApprovalExample example);

    int updateByExample(@Param("record") MyApproval record, @Param("example") MyApprovalExample example);

    int updateByPrimaryKeySelective(MyApproval record);

    int updateByPrimaryKey(MyApproval record);

    List<MyApproval> getMyLIstById(String myPrId);
}