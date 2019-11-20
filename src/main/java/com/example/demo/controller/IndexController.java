package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class IndexController {
    @GetMapping("/test")
    public Object getJson(HttpServletRequest request){
        String localAddr = request.getLocalAddr();
        String remoteAddr = request.getRemoteAddr();
        System.out.println("localAddr"+localAddr);
        System.out.println("remoteAddr"+remoteAddr);
        return localAddr;
    }
}
