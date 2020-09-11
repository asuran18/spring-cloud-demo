package com.feign.demo.service;

import com.feign.demo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "nacos-demo", path = "user", contextId = "userClient")
public interface UserClient {

    @GetMapping("/{id}")
    String getUser(@PathVariable("id") String id);

    @GetMapping("/detail")
    String detail(@RequestParam("name") String name,
                         @RequestParam("age") Integer age);

    @GetMapping
    String user(@SpringQueryMap User user);

    @PostMapping
    String save(@RequestBody User user);
}
