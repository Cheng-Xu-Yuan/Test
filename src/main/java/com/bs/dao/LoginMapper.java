package com.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LoginMapper {
    //登录
    public Integer judge(Map paramMap);
    //查询用户权限
    public List<Map> findAll(Map paramMap);
    //查询用户信息
    public List<Map> findAllUser(Map paramMap);
}
