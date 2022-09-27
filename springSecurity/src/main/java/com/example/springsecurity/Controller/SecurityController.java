package com.example.springsecurity.Controller;

import org.springframework.web.bind.annotation.PostMapping;

public class SecurityController {

    @PostMapping(value = "/login")
    public String login(){
        return "login";
    }
}
