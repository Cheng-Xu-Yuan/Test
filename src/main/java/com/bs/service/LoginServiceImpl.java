package com.bs.service;

import com.bs.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public Integer judge(Map paramMap) {
        return null;
    }
}
