package com.saraya.controller;

import com.saraya.models.User;
import com.saraya.security.Authentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class LoginController {
    @Autowired
    private Authentification authentification;


    @RequestMapping(value= {"/login"})
    public String login(
            @RequestParam("email") String email, @RequestParam("password") String password
            ){
        if(email!=null&&password!=null){
            if (this.authentification.login(new User(email, password))){

                return "redirect:/owners/list";
            }
        }

        return "home";
    }
    @RequestMapping(value="/logout")
    public String logout(){

        return "redirect:/";
    }
}
