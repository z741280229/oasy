package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.ApprovalList;
import com.ethan.oasy.pojo.ApprovalListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalListMapper {
    int countByExample(ApprovalListExample example);

    int deleteByExample(ApprovalListExample example);

    int deleteByPrimaryKey(Integer alId);

    int insert(ApprovalList record);

    int insertSelective(ApprovalList record);

    List<ApprovalList> selectByExample(ApprovalListExample example);

    ApprovalList selectByPrimaryKey(Integer alId);

    int updateByExampleSelective(@Param("record") ApprovalList record, @Param("example") ApprovalListExample example);

    int updateByExample(@Param("record") ApprovalList record, @Param("example") ApprovalListExample example);

    int updateByPrimaryKeySelective(ApprovalList record);

    int updateByPrimaryKey(ApprovalList record);
}