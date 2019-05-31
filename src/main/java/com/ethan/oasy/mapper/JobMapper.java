package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Job;
import com.ethan.oasy.pojo.JobExample;
import com.ethan.oasy.pojo.JobWithBLOBs;
import java.util.List;

import com.ethan.oasy.pojo.Staff;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    int countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(String jobId);

    int insert(JobWithBLOBs record);

    int insertSelective(JobWithBLOBs record);

    List<JobWithBLOBs> selectByExampleWithBLOBs(JobExample example);

    List<Job> selectByExample(JobExample example);

    JobWithBLOBs selectByPrimaryKey(String jobId);

    int updateByExampleSelective(@Param("record") JobWithBLOBs record, @Param("example") JobExample example);

    int updateByExampleWithBLOBs(@Param("record") JobWithBLOBs record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(JobWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobWithBLOBs record);

    int updateByPrimaryKey(Job record);

    List<JobWithBLOBs> getJobsByStaffId(@Param("staffId") String staffId);

    List<JobWithBLOBs> findMySubJob(@Param("staffId") String staffId);

    List<Staff> findJobParticipant(@Param("jobId") String jobId);
}