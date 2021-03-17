package com.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleManageMapper {
    //查询所有角色
    public List<Map> findAllRole(Map paramMap);
    //添加角色
    public void add(Map paramMap);
    //修改角色
    public void update(Map paramMap);
    //删除角色
    public void del(Map paramMap);
}
