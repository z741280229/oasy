package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Document;
import org.springframework.beans.factory.xml.DocumentDefaultsDefinition;

import java.util.List;

/**
 * 文件接口
 */
public interface DocumentService {
    /**
     * 查询某个目录的文件
     *
     * @param caId
     * @return
     */
    List<Document> findDocumentByCatalogId(Integer caId);

    /**
     * 删除文件
     *
     * @param docuId
     * @return
     */
    int deleteDocument(String docuId);

    /**
     * 更新文件
     *
     * @param document
     * @return
     */
    int updateDocument(Document document);

    /**
     * 插入文件
     *
     * @param document
     * @return
     */
    int insertDocument(Document document);

    /**
     * 查询某个文件信息
     * @param docuId
     * @return
     */
    Document findDocumentById(String docuId);

    /**
     * 查询某大类的所有文件
     * @param distinguish
     * @return
     */
    List<Document> findDocuByDistinguish(Integer distinguish);
}
