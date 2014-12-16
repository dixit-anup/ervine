package com.dixit.ceti.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The main AppConfig configuration class doesn't do anything but hits Spring on where to look for its components through @ComponentScan annotation.
 */
@Configuration
@ComponentScan(basePackages = "com.dixit.ceti.web")
class AppConfig {
}