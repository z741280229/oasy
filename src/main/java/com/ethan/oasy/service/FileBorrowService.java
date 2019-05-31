package com.ethan.oasy.service;

import com.ethan.oasy.pojo.File;
import com.ethan.oasy.pojo.FileBorrow;


import java.util.List;

/**
 * 档案借阅业务层
 */
public interface FileBorrowService {
    int addFileBorrow(FileBorrow fileBorrow);
    int updateFileBorrow(FileBorrow fileBorrow);
    int deleteFileBorrow(String fbId);
    FileBorrow getFileBorrowById(String fbId);
    List<FileBorrow> getAll();
    List<FileBorrow> getMyAll(String borrowerId);
    List<File> getNotBorrowFile();
}
