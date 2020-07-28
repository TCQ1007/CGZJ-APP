package com.cdut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//声明当前应用是Eureka服务中心
public class MeNameMdfService {
    public static void main(String[] args){
        SpringApplication.run(MeNameMdfService.class,args);
    }
}
