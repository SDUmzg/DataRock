package com.alearner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-10 12:05
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RabbitmqQueueApplication {

    public static void main(String [] args){
        SpringApplication.run(RabbitmqQueueApplication.class,args);
    }
}
