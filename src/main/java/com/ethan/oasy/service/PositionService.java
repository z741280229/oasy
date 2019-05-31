package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Position;

import java.util.List;

/**
 * 职位业务层
 */
public interface PositionService {

    /**
     * 查询所有职位信息
     * @return
     */
    List<Position> findAll();

    /**
     * 根据部门ID查询
     * @param posiId
     * @return
     */
    Position findPositionById(String posiId);

    /**
     * 添加部门
     * @param position
     * @return
     */
    int addPosition(Position position);

    /**
     *删除部门
     * @param posiId
     * @return
     */
    int deletePosition(String posiId);

    /**
     * 更新部门信息
     * @param position
     * @return
     */
    int updatePosition(Position position);
}
