package com.example.blog.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**").allowedOrigins("*").allowedMethods("*").maxAge(3600L).allowedHeaders("*").exposedHeaders("Authorization").allowCredentials(true);
    }
}
