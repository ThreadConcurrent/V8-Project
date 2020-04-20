package com.sunline.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author WangCheng
 * @describe
 * @create 2020-04-20 13:45
 */
@SpringBootApplication
@EnableEurekaServer
public class AdpEurekaServer6999 {
    public static void main(String[] args) {
        SpringApplication.run(AdpEurekaServer6999.class,args);
    }
}
