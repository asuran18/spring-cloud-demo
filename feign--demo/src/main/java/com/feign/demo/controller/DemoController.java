package com.feign.demo.controller;

import com.feign.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/echo")
    public String echoAppName(){
        return demoService.getConfig();
    }
}
