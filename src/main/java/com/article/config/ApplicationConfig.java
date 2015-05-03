package com.article.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by okjeun on 15. 4. 11.
 */
@Configuration
@ComponentScan("com.article")
@EnableAutoConfiguration
public class ApplicationConfig {
}
