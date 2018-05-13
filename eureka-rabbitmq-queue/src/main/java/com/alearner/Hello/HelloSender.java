package com.alearner.Hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-10 13:04
 **/
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String content = "hello , "+new Date();
        System.out.println(content);
        rabbitTemplate.convertAndSend("hello",content);
    }
}
