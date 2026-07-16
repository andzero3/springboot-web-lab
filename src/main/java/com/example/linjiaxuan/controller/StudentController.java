package com.example.linjiaxuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String index() {
        System.out.println("学号: 202535720115");
        System.out.println("姓名: 林嘉轩");
        return "学号: 202535720115, 姓名: 林嘉轩";
    }
}
