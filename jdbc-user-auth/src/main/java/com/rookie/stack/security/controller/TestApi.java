package com.rookie.stack.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eumenides
 * @description
 * @date 2024/9/1
 */
@RestController
@RequestMapping("/security")
public class TestApi {
    @GetMapping("/hello")
    public String HelloSecurity(){
        return "Hello Security";
    }
}
