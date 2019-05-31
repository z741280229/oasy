package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.CatalogMapper;
import com.ethan.oasy.pojo.Catalog;
import com.ethan.oasy.pojo.CatalogExample;
import com.ethan.oasy.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.awt.geom.AreaOp;

import java.util.List;

/**
 * @program: oasy
 * @description: 树形接口实现类
 * @author: sam
 * @create: 2019-04-11 14:00
 */
@Service
@Transactional
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogMapper catalogMapper;

    @Override
    public List<Catalog> findAllCatalog(Integer distinguish) {
        CatalogExample example = new CatalogExample();
        CatalogExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andDistinguishEqualTo(distinguish);
        return catalogMapper.selectByExample(example);
    }

    @Override
    public int insertCatalog(Catalog catalog) {
        return catalogMapper.insertSelective(catalog);
    }

    @Override
    public int updateCatalog(Catalog catalog) {
        return catalogMapper.updateByPrimaryKeySelective(catalog);
    }

    @Override
    public int deleteCatalog(Integer caId) {
        Catalog catalog = new Catalog();
        catalog.setCatId(caId);
        catalog.setDataStatus(0);
        return catalogMapper.updateByPrimaryKeySelective(catalog);
    }

    @Override
    public Catalog findCatById(Integer catId) {
        return catalogMapper.selectByPrimaryKey(catId);
    }
}
