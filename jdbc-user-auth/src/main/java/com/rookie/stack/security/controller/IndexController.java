package com.rookie.stack.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author eumenides
 * @description
 * @date 2024/9/3
 */
@Controller
public class IndexController {
    @RequestMapping("/login.html")
    public String index(){
        return "login";
    }
}
