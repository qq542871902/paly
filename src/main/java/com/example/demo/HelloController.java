package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@Controller
@RestController("/")
public class HelloController {
    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        System.out.println("--------comehere-----");
        return "hello world";
    }

}
