package com.cdut.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//声明当前应用是Eureka服务中心
public class zltEurekaApplication {
    public static void main(String [] args){
        SpringApplication.run(zltEurekaApplication.class,args);
    }

}
