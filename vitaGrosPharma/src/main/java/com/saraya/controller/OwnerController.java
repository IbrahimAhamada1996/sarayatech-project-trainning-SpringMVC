package com.saraya.controller;

import com.saraya.models.Owner;
import com.saraya.services.OwnerService;
import com.saraya.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OwnerController {

    @Autowired
   private  OwnerService ownerService;

    private PetService petService;

    @RequestMapping(value= {"/owners/list"})
    public String list(ModelMap modelMap){
        modelMap.addAttribute("owners",this.ownerService.getOwners());
       return "owner/list" ;
    }

    @RequestMapping(value="/owners/add",method = RequestMethod.GET)
    public String formAdd(){

        return "owner/formAdd" ;
    }

    @RequestMapping(value = "/owners/add",method = RequestMethod.POST)
    public String add(
            @RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
            @RequestParam("address") String address,@RequestParam("city") String city,@RequestParam("telephone") String telephone
    ){
        Owner owner  = new Owner(firstname,lastname,address,city,telephone);
        this.ownerService.add(owner);
        return "redirect:/owners/list";
    }

    @RequestMapping(value="/owners/{id}/update")
    public String formupdate( @PathVariable("id") int id,ModelMap modelMap){
        modelMap.addAttribute("owner",this.ownerService.findOneById(id));
        return "owner/formUpdate" ;
    }

    @RequestMapping(value = "/owners/{id}/modified",method = RequestMethod.POST)
    public String update(
            @PathVariable("id") int id,ModelMap modelMap,
            @RequestParam("firstname")  String firstname,@RequestParam("lastname") String lastname,
            @RequestParam("address") String address,@RequestParam("city") String city,@RequestParam("telephone") String telephone
    ){
        if(firstname!=null&&lastname!=null&&address!=null&&city!=null&&telephone!=null){
            Owner owner  = new Owner(firstname,lastname,address,city,telephone);
            this.ownerService.update(id,owner);
            System.out.println("id = " + id + ", modelMap = " + modelMap + ", firstname = " + firstname + ", lastname = " + lastname + ", address = " + address + ", city = " + city + ", telephone = " + telephone);
            return "redirect:/owners/list";
        }

        return "owner/formUpdate" ;
    }
    @RequestMapping(value="owners/search",method = RequestMethod.GET)
    public String search(ModelMap modelMap){
        modelMap.addAttribute("ownersSearch",null);
        return "owner/search";
    }

    @RequestMapping("owners/search2")
    public String searchShow(@RequestParam String lastname,ModelMap modelMap){
        modelMap.addAttribute("ownersSearch",this.ownerService.searchByLastname(lastname));
        return "owner/search";
    }

    @RequestMapping(value = "/owners/{id}/delete",method = RequestMethod.GET)
    public String delete(
            @PathVariable("id") int id){

            this.ownerService.delete(id);

            return "redirect:/owners/list";

    }

    @RequestMapping(value = "/owners/{id}/show",method = RequestMethod.GET)
    public String show(
            @PathVariable("id") int id,ModelMap modelMap){
        System.out.println("id = " + id + ", modelMap = " + this.ownerService.findOneById(id));
        modelMap.addAttribute("owner",this.ownerService.findOneById(id));
       // modelMap.addAttribute("pets",this.petService.findByOwnerId(id));

        return "owner/show";

    }

}
