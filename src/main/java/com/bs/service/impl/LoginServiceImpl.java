package com.bs.service.impl;

import com.bs.dao.LoginMapper;
import com.bs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    //登录
    @Override
    public Integer judge(Map paramMap) {
        return loginMapper.judge(paramMap);
    }
    //查询用户权限
    @Override
    public List<Map> findAll(Map paramMap) {
        return loginMapper.findAll(paramMap);
    }
    //查询用户信息
    @Override
    public List<Map> findAllUser(Map paramMap) {
        return loginMapper.findAllUser(paramMap);
    }
}
