package com.feign.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-demo")
public interface DemoService {

    @GetMapping(value = "/data/config")
    String getConfig();
}
