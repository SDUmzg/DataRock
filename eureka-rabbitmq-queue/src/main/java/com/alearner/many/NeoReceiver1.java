package com.alearner.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-10 14:36
 **/
@Component
@RabbitListener(queues = "neo")
public class NeoReceiver1 {

    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 1: " + neo);
    }

}