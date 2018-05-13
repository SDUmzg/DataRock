package com.alearner.Hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-10 13:20
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelloSenderTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void send() {
        helloSender.send();
    }
}