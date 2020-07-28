package com.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 *@author by java开发-曾
 *2020/7/28 14:13
 *文件说明：
 */
@SpringBootApplication
@EnableEurekaClient
public class HomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class,args);
    }
}
