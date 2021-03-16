package com.bs.dao;

import com.bs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zzf
 * @description
 * @create: 2021-03-16 08:35
 */
@Mapper
public interface UserDao {
    public List<Map> findUserAll();
}
