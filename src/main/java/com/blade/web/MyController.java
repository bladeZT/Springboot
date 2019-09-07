package com.blade.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

//@Controller
@RestController
public class MyController {

    @Autowired
    private DataSource dataSource;


    @RequestMapping("/hello")
//    @ResponseBody
    //如果上面写的是restController，下面就不需要写responsebody了
    public String hello(){
        System.out.println("dataSource = " + dataSource);
        return "hello springboot1233233";
    }
}
