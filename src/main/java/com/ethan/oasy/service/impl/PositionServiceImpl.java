package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.PositionMapper;
import com.ethan.oasy.pojo.Position;
import com.ethan.oasy.pojo.PositionExample;
import com.ethan.oasy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 职位业务层实现类
 * @author: sam
 * @create: 2019-04-02 21:51
 */
@Service
@Transactional
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> findAll() {
        PositionExample example = new PositionExample();
        PositionExample.Criteria criteria = example.createCriteria();
        criteria.andPosiIdIsNotNull();
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        return positionMapper.selectByExample(example);
    }

    @Override
    public Position findPositionById(String posiId) {
        return positionMapper.selectByPrimaryKey(posiId);
    }

    @Override
    public int addPosition(Position position) {
        return positionMapper.insertSelective(position);
    }

    @Override
    public int deletePosition(String posiId) {
        Position position = new Position();
        position.setPosiId(posiId);
        position.setDataStatus(Byte.valueOf("0"));
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    @Override
    public int updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }
}
