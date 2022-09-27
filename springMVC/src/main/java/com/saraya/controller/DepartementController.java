package com.saraya.controller;

import com.saraya.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class DepartementController {

    @Autowired
    DepartementService departementService;

    @RequestMapping("/list")
    public String list(ModelMap model){

        System.out.println("departementService = " + departementService.getDepartements());
        model.addAttribute("departements",departementService.getDepartements());

        return "departement/list";
    }

    @RequestMapping("/{id}/show")
    public void show(@PathVariable Long id){
        this.departementService.getDepartement(id);
        System.out.println(" departement of id  = " + this.departementService.getDepartement(id));
    }
    @RequestMapping("/{id}/delete")
    public void delete(@PathVariable Long id){
        this.departementService.getDepartement(id);
        System.out.println(" departement of id  = " + this.departementService.getDepartement(id));
    }
}
