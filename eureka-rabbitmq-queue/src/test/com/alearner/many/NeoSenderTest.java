package com.alearner.many;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-10 14:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class NeoSenderTest {

    @Autowired
    private NeoSender neoSender;
    @Autowired
    private NeoSender2 neoSender2;
    @Test
    public void OneToMany() {
        for (int i =0;i<30;i++){
            neoSender.send(i);
        }
    }

    @Test
    public void ManyToMany() {
        for (int i =0;i<30;i++){
            neoSender.send(i);
            neoSender2.send(i);
        }
    }
}