package com.presenceweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(
                "/static/css/**",
                "/templates/pages/**")
                .addResourceLocations(
                        "classpath:/",
                        "classpath:/static/css/",
                        "classpath:/templates/pages/");
    }
}
