package com.itheima.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 19:55 2018/9/4
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {

        System.out.println("hello world");

        return "Hello World";
    }
}
