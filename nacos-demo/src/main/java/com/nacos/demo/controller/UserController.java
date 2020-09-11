package com.nacos.demo.controller;

import com.nacos.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id) {
        return "hello " + id;
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("name") String name,
                             @RequestParam("age") Integer age) {
        return name + "," + age;
    }

    @GetMapping
    public String user(User user) {
        return user.getId() + "," + user.getName() + "," + user.getAge();
    }

    @PostMapping
    public String save(@RequestBody User user) {
        return "save success" + user.getId();
    }
}
