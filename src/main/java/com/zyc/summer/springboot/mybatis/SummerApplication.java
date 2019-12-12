package com.zyc.summer.springboot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zyc.summer.springboot.mybatis.dao")
public class SummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerApplication.class, args);
    }

}
