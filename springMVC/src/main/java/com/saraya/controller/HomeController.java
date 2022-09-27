package com.saraya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class HomeController {

    @RequestMapping(value = "/home/{name}")
    public String home(@PathVariable String name){
        Logger.getLogger(name);
        System.out.println("model  Ibrahim= " +name);
        return "home";
    }


}
