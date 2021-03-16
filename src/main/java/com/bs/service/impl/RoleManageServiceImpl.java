package com.bs.service.impl;

import com.bs.dao.RoleManageMapper;
import com.bs.service.RoleManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleManageServiceImpl implements RoleManageService {
    @Autowired
    private RoleManageMapper roleManageMapper;
    //查询所有角色
    @Override
    public List<Map> findAllRole(Map paramMap) {
        return roleManageMapper.findAllRole(paramMap);
    }
}
