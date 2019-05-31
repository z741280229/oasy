package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Procedu;

import java.util.List;

/**
 * 审批流转流程图业务层
 */
public interface ProcedureService {
    List<Procedu> getProcedureById(Integer prTypeId);
}
