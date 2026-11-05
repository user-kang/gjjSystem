package com.yibin.gjjsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yibin.gjjsystem.mapper")
public class GjjSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjjSystemApplication.class, args);
    }

}
