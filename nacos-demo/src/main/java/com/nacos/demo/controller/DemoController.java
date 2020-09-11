package com.nacos.demo.controller;

import com.nacos.demo.config.TestConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RefreshScope
@Controller
@RequestMapping("/data")
public class DemoController {

    @Value("${msg}")
    private String msg;
    @Value("${dynamicMsg}")
    private String dynamicMsg;
    @Resource
    private TestConfig config;

    @GetMapping(value = "/config")
    @ResponseBody
    public String config() {
        return config.getId() + ":" + config.getName();
    }

    @GetMapping(value = "/dynamicMsg")
    @ResponseBody
    public String dynamicMsg() {
        return dynamicMsg;
    }

    @GetMapping(value = "/msg")
    @ResponseBody
    public String msg() {
        return msg;
    }

}
