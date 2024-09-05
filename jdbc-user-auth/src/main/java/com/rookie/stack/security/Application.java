package com.rookie.stack.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eumenides
 * @description
 * @date 2024/9/5
 */
@SpringBootApplication
@MapperScan("com.rookie.stack.security.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
