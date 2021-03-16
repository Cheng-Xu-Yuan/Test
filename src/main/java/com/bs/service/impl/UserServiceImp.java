package com.bs.service.impl;

import com.bs.dao.UserDao;
import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zzf
 * @description
 * @create: 2021-03-16 08:33
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<Map> findUserAll() {
        return dao.findUserAll();
    }
}
