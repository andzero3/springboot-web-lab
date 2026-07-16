package com.example.linjiaxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.linjiaxuan.mapper")
public class LinJiaXuanApplication {
    public static void main(String[] args) {
        SpringApplication.run(LinJiaXuanApplication.class, args);
    }
}
