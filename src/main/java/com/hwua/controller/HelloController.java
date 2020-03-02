package com.hwua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(Map<String,Object> map){
        map.put("name","zhangsan");
        map.put("age",10);
        return "success";
    }
}
