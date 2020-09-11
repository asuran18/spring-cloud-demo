package com.feign.demo.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public Logger.Level getLoggerLevel() {
        return Logger.Level.FULL;
    }
}
