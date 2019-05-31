package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.DocumentMapper;
import com.ethan.oasy.pojo.Document;
import com.ethan.oasy.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 文件业务层实现类
 * @author: sam
 * @create: 2019-04-11 15:22
 */
@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public List<Document> findDocumentByCatalogId(Integer caId) {
        return documentMapper.findFilesByCatalogId(caId);
    }

    @Override
    public int deleteDocument(String docuId) {
        Document document = new Document();
        document.setDataStatus(0);
        document.setDocuId(docuId);
        return documentMapper.updateByPrimaryKeySelective(document);
    }

    @Override
    public int updateDocument(Document document) {
        return documentMapper.updateByPrimaryKeySelective(document);
    }

    @Override
    public int insertDocument(Document document) {
        return documentMapper.insertSelective(document);
    }

    @Override
    public Document findDocumentById(String docuId) {
        return documentMapper.selectByPrimaryKey(docuId);
    }

    @Override
    public List<Document> findDocuByDistinguish(Integer distinguish) {
        return documentMapper.findFilesByDistinguish(distinguish);
    }
}
