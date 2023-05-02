package com.example.annotation.config;

import com.example.annotation.interceptor.CKSInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public  void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CKSInterceptor());
    }
}
