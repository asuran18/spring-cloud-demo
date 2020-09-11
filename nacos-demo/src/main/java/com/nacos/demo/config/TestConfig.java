package com.nacos.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "demo.prop")
@Component
public class TestConfig {

    private String id;

    private String name;
}
