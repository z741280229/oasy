package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.FileBorrow;
import com.ethan.oasy.pojo.FileBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileBorrowMapper {
    int countByExample(FileBorrowExample example);

    int deleteByExample(FileBorrowExample example);

    int deleteByPrimaryKey(String fileBorrowId);

    int insert(FileBorrow record);

    int insertSelective(FileBorrow record);

    List<FileBorrow> selectByExampleWithBLOBs(FileBorrowExample example);

    List<FileBorrow> selectByExample(FileBorrowExample example);

    FileBorrow selectByPrimaryKey(String fileBorrowId);

    int updateByExampleSelective(@Param("record") FileBorrow record, @Param("example") FileBorrowExample example);

    int updateByExampleWithBLOBs(@Param("record") FileBorrow record, @Param("example") FileBorrowExample example);

    int updateByExample(@Param("record") FileBorrow record, @Param("example") FileBorrowExample example);

    int updateByPrimaryKeySelective(FileBorrow record);

    int updateByPrimaryKeyWithBLOBs(FileBorrow record);

    int updateByPrimaryKey(FileBorrow record);
}