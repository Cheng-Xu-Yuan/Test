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
    //添加或修改角色
    @Override
    public void addOrUpdate(Map paramMap) {
        if (paramMap.get("role_id")!=""){
            roleManageMapper.update(paramMap);
        }else{
            roleManageMapper.add(paramMap);
        }
    }
    //删除角色
    @Override
    public void del(Map paramMap) {
        roleManageMapper.del(paramMap);
    }
}
