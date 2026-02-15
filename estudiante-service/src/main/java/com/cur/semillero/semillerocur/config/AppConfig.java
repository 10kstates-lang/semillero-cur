package com.cur.semillero.semillerocur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    // Esto crea el "navegador interno" que usará Spring Boot
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}