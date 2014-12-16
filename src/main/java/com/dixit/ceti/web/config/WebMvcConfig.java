package com.dixit.ceti.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * WebMvcConfig class enables Spring MVC with @EnableWebMvc annotation. It extends WebMvcConfigurerAdapter,
 * which provides empty methods that can be overridden to customize default configuration of Spring MVC.
 * We will stick to default configuration at this time, but it’s advised for you to see what the possibilities are.
 */
@EnableWebMvc
@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
}