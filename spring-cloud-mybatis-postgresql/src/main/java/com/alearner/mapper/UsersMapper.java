package com.alearner.mapper;

import com.alearner.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersMapper {
    List<Users> findAll();
    Users findOne(@Param(value = "id") int id);
}
