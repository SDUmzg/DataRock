package com.alearner;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.alearner.mapper")
public class MybatisPostgresqlApplication {

    public static void main(String [] args){
        SpringApplication.run(MybatisPostgresqlApplication.class,args);
    }

}
