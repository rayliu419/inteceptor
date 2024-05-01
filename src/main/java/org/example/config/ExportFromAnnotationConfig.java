package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExportFromAnnotationConfig {

    @Bean
    public String newString() {
        System.out.println("create bean with annotation");
        return new String("annotation string");
    }
}
