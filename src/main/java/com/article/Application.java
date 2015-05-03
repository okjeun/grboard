package com.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by okjeun on 15. 4. 11.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.article")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
