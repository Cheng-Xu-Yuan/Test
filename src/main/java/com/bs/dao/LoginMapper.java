package com.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper {
    public Integer judge(Map paramMap);
}
