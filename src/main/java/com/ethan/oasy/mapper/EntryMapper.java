package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Entry;
import com.ethan.oasy.pojo.EntryExample;
import com.ethan.oasy.pojo.EntryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryMapper {
    int countByExample(EntryExample example);

    int deleteByExample(EntryExample example);

    int deleteByPrimaryKey(String enId);

    int insert(EntryWithBLOBs record);

    int insertSelective(EntryWithBLOBs record);

    List<EntryWithBLOBs> selectByExampleWithBLOBs(EntryExample example);

    List<Entry> selectByExample(EntryExample example);

    EntryWithBLOBs selectByPrimaryKey(String enId);

    int updateByExampleSelective(@Param("record") EntryWithBLOBs record, @Param("example") EntryExample example);

    int updateByExampleWithBLOBs(@Param("record") EntryWithBLOBs record, @Param("example") EntryExample example);

    int updateByExample(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByPrimaryKeySelective(EntryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EntryWithBLOBs record);

    int updateByPrimaryKey(Entry record);
}