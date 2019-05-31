package com.ethan.oasy.service;

import com.ethan.oasy.pojo.File;

import java.util.List;

/**
 * 档案业务层
 */
public interface FileService {
    int addFile(File file);
    int deleteFile(String fId);
    int updateFile(File file);
    File getFileById(String fId);
    List<File> getAllFile();

    /**
     * 获取所有类目的档案
     * @param pId
     * @return
     */
    List<File> getFilesByFileBelong(Integer pId);
}
