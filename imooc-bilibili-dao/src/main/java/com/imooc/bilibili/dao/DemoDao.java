package com.imooc.bilibili.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yujie
 * @Date: 2023/7/26
 */
@Mapper
public interface DemoDao {

    public Long query(Long id);
}
