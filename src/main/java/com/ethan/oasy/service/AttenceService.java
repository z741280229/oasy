package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Attence;
import com.ethan.oasy.pojo.AttenceCount;

import java.util.List;

/**
 * 考勤接口
 */
public interface AttenceService {
    int addAttence(Attence attence);
    int deleteAttence(String atId);
    int updateAttence(Attence attence);
    Attence getAttenceById(String btId);
    List<Attence> getMyAttences(String staffId);
    List<Attence> getDepartAttences(String departId);
    List<Attence> getAll();
    List<AttenceCount> getCount();
}
