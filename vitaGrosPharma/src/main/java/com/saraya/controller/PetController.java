package com.saraya.controller;

import com.saraya.models.Owner;
import com.saraya.models.Pet;
import com.saraya.models.PetType;
import com.saraya.services.OwnerService;
import com.saraya.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;
    @Autowired
    private OwnerService ownerService;


    @RequestMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("owners",this.petService.getPets());
        return "pet/list" ;
    }

    @RequestMapping(value="{idOwner}/add",method = RequestMethod.GET)
    public String formAdd(@PathVariable("idOwner") int idOwner,ModelMap modelMap){
        modelMap.addAttribute("petTypes",PetType.values());
        modelMap.addAttribute("owner",this.ownerService.findOneById(idOwner));
        return "pet/formAdd" ;
    }

    @RequestMapping(value="{idOwner}/add",method = RequestMethod.POST)
    public String add(
            @PathVariable("idOwner") int idOwner,
            @RequestParam("name") String name, @RequestParam("dateOfBirth") String dateOfBirth,
            @RequestParam("petType") String petType ,ModelMap modelMap
    ){

        Pet pet = new Pet(name, LocalDate.parse(dateOfBirth),PetType.valueOf(petType),this.ownerService.findOneById(idOwner));
       this.ownerService.add(this.ownerService.findOneById(idOwner),pet);
        this.petService.add(pet);
        System.out.println(this.petService.getPets());
        return "redirect:/owners/{idOwner}/show";
    }




    @RequestMapping(value="/{id}/update",method = RequestMethod.GET)
    public String formupdate( @PathVariable("id") int id,ModelMap modelMap){
        modelMap.addAttribute("petTypes",PetType.values());
        modelMap.addAttribute("pet",this.petService.findOneById(id));
        return "pet/formUpdate";
    }

    @RequestMapping(value="/{id}/update",method = RequestMethod.POST)
    public String update(
            @PathVariable("id") int id, ModelMap modelMap,
            @RequestParam("name") String name, @RequestParam("dateOfBirth") String dateOfBirth,
            @RequestParam("petType") String petType
    ){
        if(name!=null&&dateOfBirth!=null&&petType!=null){
            Pet pet = new Pet(name, LocalDate.parse(dateOfBirth),PetType.valueOf(petType));
            this.petService.update(id,pet);
            return "redirect:/owners/list";
        }else{
            modelMap.addAttribute("owner",this.petService.findOneById(id));
        }

        return "pet/formUpdate" ;
    }
}
