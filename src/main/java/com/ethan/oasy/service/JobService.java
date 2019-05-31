package com.ethan.oasy.service;

import com.ethan.oasy.pojo.JobWithBLOBs;
import com.ethan.oasy.pojo.Staff;

import java.util.List;

/**
 * 任务接口
 */
public interface JobService {

    /**
     * 插入工作
     * @param jobWithBLOBs
     * @return
     */
    int insertJob(JobWithBLOBs jobWithBLOBs);

    /**
     * 删除工作
     * @param jobId
     * @return
     */
    int deleteJob(String jobId);

    /**
     * 更新工作
     * @param job
     * @return
     */
    int updateJob(JobWithBLOBs job);

    /**
     * 获取所有任务信息
     * @return
     */
    List<JobWithBLOBs> getAllJobs();

    /**
     * 获取指定任务
     * @param jobId
     * @return
     */
    JobWithBLOBs getJobById(String jobId);

    /**
     * 获取某位员的工作
     * @param staffId
     * @return
     */
    List<JobWithBLOBs> getJobsByStaffId(String staffId);

    /**
     * 获取我负责的工作
     * @param staffId
     * @return
     */
    List<JobWithBLOBs> getMyResresponsibleJob(String staffId);

    /**
     * 获取下级工作任务
     * @param staffId
     * @return
     */
    List<JobWithBLOBs> findMySubJob(String staffId);

    /**
     * 查询某个工作的参与者
     * @param jobId
     * @return
     */
    List<Staff> findJobParticipant(String jobId);
}
