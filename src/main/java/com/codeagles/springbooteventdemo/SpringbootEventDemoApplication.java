package com.codeagles.springbooteventdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootEventDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEventDemoApplication.class, args);
    }

}
