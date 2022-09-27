package com.saraya.controller;

import com.saraya.models.Pet;
import com.saraya.models.PetType;
import com.saraya.models.Visit;
import com.saraya.services.OwnerService;
import com.saraya.services.PetService;
import com.saraya.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    private VisitService visitService;
    @Autowired
    private PetService petService;


    @RequestMapping("{idPet}/list")
    public String list(ModelMap modelMap, @PathVariable("idPet") int idPet ){
        List<Pet> pets = this.petService.getPets().stream().filter(pet -> pet.getId()==idPet).collect(Collectors.toList());
        modelMap.addAttribute("pets",pets);
        modelMap.addAttribute("idPet",idPet);
        return "visit/list" ;
    }


    @RequestMapping(value="{idPet}/add",method = RequestMethod.GET)
    public String formAdd( @PathVariable("idPet") int idPet , ModelMap modelMap){

        return "visit/formAdd" ;
    }
    @RequestMapping(value="{idPet}/add",method = RequestMethod.POST)
    public String add(
            @PathVariable("idPet") int idPet,
            @RequestParam("date") String date,
            @RequestParam("description") String description , ModelMap modelMap
    ){

        Visit visit = new Visit( LocalDate.parse(date),description,this.petService.findOneById(idPet));
        this.petService.add(this.petService.findOneById(idPet),visit);
        this.visitService.add(visit);
        return "redirect:/visits/{idPet}/list" ;
    }

    @RequestMapping("/{id}/update")
    public String update(
            @PathVariable("id") int id, ModelMap modelMap,
            @RequestParam("name") String name, @RequestParam("dateOfBirth") String dateOfBirth,
            @RequestParam("petType") String petType
    ){
        if(name!=null&&dateOfBirth!=null&&petType!=null){
            Pet pet = new Pet(name, LocalDate.parse(dateOfBirth),PetType.valueOf(petType));
            this.petService.update(id,pet);
            return "redirect:/visits/{idPet}/list";
        }
        modelMap.addAttribute("owner",this.petService.findOneById(id));
        return "pet/formUpdate" ;
    }

    @RequestMapping(value = "/{id}/delete",method = RequestMethod.GET)
    public String delete(
            @PathVariable("id") int id){

        this.visitService.delete(id);

        return "redirect:/visits/{idPet}/list";

    }
}
