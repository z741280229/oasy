package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.JobMapper;
import com.ethan.oasy.mapper.NoticeStaffMapper;
import com.ethan.oasy.pojo.Job;
import com.ethan.oasy.pojo.JobExample;
import com.ethan.oasy.pojo.JobWithBLOBs;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 任务业务层实现类
 * @author: sam
 * @create: 2019-04-06 21:46
 */
@Service
@Transactional
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;


    @Override
    public int insertJob(JobWithBLOBs jobWithBLOBs) {
        return jobMapper.insertSelective(jobWithBLOBs);
    }

    @Override
    public int deleteJob(String jobId) {
        Job job = new Job();
        job.setJobId(jobId);
        job.setDataStatus(Byte.valueOf("0"));
        return jobMapper.updateByPrimaryKey(job);
    }

    @Override
    public int updateJob(JobWithBLOBs job) {
        return jobMapper.updateByPrimaryKeyWithBLOBs(job);
    }

    @Override
    public List<JobWithBLOBs> getAllJobs() {
        JobExample example = new JobExample();
        JobExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        criteria.andJobIdIsNotNull();
        return jobMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public JobWithBLOBs getJobById(String jobId) {
        return jobMapper.selectByPrimaryKey(jobId);
    }

    @Override
    public List<JobWithBLOBs> getJobsByStaffId(String staffId) {
        return jobMapper.getJobsByStaffId(staffId);
    }

    @Override
    public List<JobWithBLOBs> getMyResresponsibleJob(String staffId) {
        JobExample example = new JobExample();
        JobExample.Criteria criteria = example.createCriteria();
        criteria.andJobLeaderEqualTo(staffId);
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        criteria.andJobIdIsNotNull();
        return jobMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<JobWithBLOBs> findMySubJob(String staffId) {
        return jobMapper.findMySubJob(staffId);
    }

    @Override
    public List<Staff> findJobParticipant(String jobId) {
        return jobMapper.findJobParticipant(jobId);
    }
}
