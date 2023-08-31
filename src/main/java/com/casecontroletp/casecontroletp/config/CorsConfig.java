package com.casecontroletp.casecontroletp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Defina os caminhos permitidos
                .allowedOrigins("http://localhost:4200") // Defina as origens permitidas
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
