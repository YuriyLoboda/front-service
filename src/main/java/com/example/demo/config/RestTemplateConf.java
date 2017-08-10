package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yulo0717 on 8/10/2017.
 */
@Configuration
public class RestTemplateConf {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
