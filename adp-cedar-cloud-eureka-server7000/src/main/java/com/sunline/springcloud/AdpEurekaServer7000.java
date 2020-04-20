package com.sunline.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author WangCheng
 * @describe
 * @create 2020-04-20 13:38
 */
@SpringBootApplication
@EnableEurekaServer
public class AdpEurekaServer7000 {
    public static void main(String[] args) {
        SpringApplication.run(AdpEurekaServer7000.class,args);
    }
}
