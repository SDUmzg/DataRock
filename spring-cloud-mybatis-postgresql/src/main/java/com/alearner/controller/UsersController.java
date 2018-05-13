package com.alearner.controller;

import com.alearner.entity.Users;
import com.alearner.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UsersController {
    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping(value = "getAll")
    public List<Users> getAll(){
        return  usersMapper.findAll();
    }

    @RequestMapping(value = "getOne")
    public Users getone(@RequestParam(value = "id")int id){
        return  usersMapper.findOne(id);
    }

}
