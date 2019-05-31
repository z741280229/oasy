package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Catalog;

import java.util.List;

/**
 * 树形目录接口
 */
public interface CatalogService {

    /**
     * 查询所有目录
     * @param distinguish
     * @return
     */
    List<Catalog> findAllCatalog(Integer distinguish);


    /**
     * 新建目录
     * @param catalog
     * @return
     */
    int insertCatalog(Catalog catalog);

    /**
     * 更新目录
     * @param catalog
     * @return
     */
    int updateCatalog(Catalog catalog);

    /**
     * 删除目录
     * @param caId
     * @return
     */
    int deleteCatalog(Integer caId);

    /**
     * 查询具体目录
     * @param catId
     * @return
     */
    Catalog findCatById(Integer catId);
}
