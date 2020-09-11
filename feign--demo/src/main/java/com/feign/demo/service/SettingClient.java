package com.feign.demo.service;

import com.feign.demo.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-demo", path = "data", contextId = "settingClient", configuration = FeignConfig.class)
public interface SettingClient {

    @GetMapping(value = "/config")
    String config();
}
