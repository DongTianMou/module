package com.dongtian.mysql_module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class hello_demo {
    @GetMapping("/say")
    public String say_hello(){
        return "hello";
    }
}

