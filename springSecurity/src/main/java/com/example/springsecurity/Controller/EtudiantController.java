package com.example.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/etudiant")
public class EtudiantController {

    @GetMapping(value = "")
    public void home(){
        System.out.println("page home");
    }

    @GetMapping(value = "/list")
    public void list(){
        System.out.println("page list");
    }
}
