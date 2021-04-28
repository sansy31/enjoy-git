package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return"Hello git -V0.8 ---merge 合并分支";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
