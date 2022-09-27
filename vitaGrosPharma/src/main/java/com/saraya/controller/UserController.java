package com.saraya.controller;

import com.saraya.models.User;
import com.saraya.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/inscription")
    public String inscrption(){
        return "inscription";
    }

    @RequestMapping(value = "/add")
    public String add(@RequestParam("email") String email,@RequestParam("password") String password){
        userService.add(new User(email, password));
        return "redirect:/";
    }
}
