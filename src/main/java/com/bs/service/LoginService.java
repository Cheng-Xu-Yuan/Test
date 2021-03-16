package com.bs.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
    //登录
    public Integer judge(Map paramMap);
    //查询用户权限
    public List<Map> findAll(Map paramMap);
    //查询用户信息
    public List<Map> findAllUser(Map paramMap);
}
