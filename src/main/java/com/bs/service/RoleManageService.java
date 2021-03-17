package com.bs.service;

import java.util.List;
import java.util.Map;

public interface RoleManageService {
    //查询所有角色
    public List<Map> findAllRole(Map paramMap);
    //添加修改角色
    public void addOrUpdate(Map paramMap);
    //删除角色
    public void del(Map paramMap);
}
