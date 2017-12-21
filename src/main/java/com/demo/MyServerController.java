package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServerController {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("Hello World");
        return "Hello World";
    }
}
