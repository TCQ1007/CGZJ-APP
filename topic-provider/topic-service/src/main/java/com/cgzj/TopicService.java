package com.cgzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TopicService {
    public static void main(String[] args) {
        SpringApplication.run(TopicService.class,args);
    }
}
