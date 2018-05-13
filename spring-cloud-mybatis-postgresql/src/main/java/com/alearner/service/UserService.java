package com.alearner.service;

import com.alearner.entity.Users;
import com.alearner.mapper.UsersMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description:
 * @author: MZG
 * @create: 2018-04-12 09:55
 **/
public class UserService {
    @Autowired
    private UsersMapper usersMapper;

    List<Users> findAll(){
        return null;
    }
    Users findOne(@Param(value = "id") int id){
        return null;
    }
}
