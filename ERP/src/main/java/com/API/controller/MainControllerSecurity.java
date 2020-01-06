package com.API.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainControllerSecurity {

    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping("/") 
    public String admin() {
        return "admin";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }

    @GetMapping("/login") 
    public String getLogin() {
        return "login";
    }
    

}