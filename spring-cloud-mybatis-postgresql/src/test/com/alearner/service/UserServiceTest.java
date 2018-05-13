package com.alearner.service;

import com.alearner.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: MZG
 * @create: 2018-04-12 11:15
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void findAll() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void test(){
        stringRedisTemplate.opsForValue().set("aaa","hiahiahia");
        System.err.println(stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void ObjecTest(){
        Users users = new Users(1,"1","pwd","email","name");
        ValueOperations<String,Users> operations = redisTemplate.opsForValue();
        operations.set("id1",users,20, TimeUnit.SECONDS);
        boolean exsits = redisTemplate.hasKey("id1");
        if (exsits){
            System.err.println("id1  :  " + operations.get("id1").getEmail());
        }else {
            System.err.println("资源失效或者不存在");
        }

    }
}