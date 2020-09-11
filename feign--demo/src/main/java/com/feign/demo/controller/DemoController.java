package com.feign.demo.controller;

import com.feign.demo.model.User;
import com.feign.demo.service.SettingClient;
import com.feign.demo.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private SettingClient settingClient;

    @GetMapping("/echo")
    public String user(){
        String sb = userClient.getUser("1") + "|" +
                userClient.detail("2", 18) + "|" +
                userClient.user(new User("3", "3", 20)) + "|" +
                userClient.save(new User("4", "4", 28));
        return sb;
    }

    @GetMapping("/config")
    public String settings() {
        return settingClient.config();
    }
}
