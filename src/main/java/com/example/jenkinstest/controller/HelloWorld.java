package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther zhoutf
 * @Date 2018/9/29 15:06
 * @Description
 */
@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String getHelloWorld()
    {
        return "ztf 6666 jenkins!!";
    }
}
