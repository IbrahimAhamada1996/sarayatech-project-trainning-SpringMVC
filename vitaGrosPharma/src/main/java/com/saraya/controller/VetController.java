package com.saraya.controller;

import com.saraya.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @Autowired
    private VetService vetService;
    @RequestMapping("/vits/list")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("vets",this.vetService.getVets());
        return "vets/list" ;
    }
}
