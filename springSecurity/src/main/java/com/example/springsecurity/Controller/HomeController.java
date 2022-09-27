package com.example.springsecurity.Controller;

import com.example.springsecurity.Model.Person;
import com.example.springsecurity.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    private PersonService personService;
    @GetMapping(value = "/")
    public String home(ModelMap modelMap){
        System.out.println("home page");
        modelMap.addAttribute("persones",personService.getPersons());
        return "home";
    }
    @PostMapping(value = "/add")
    public String add(@RequestParam("firstname") String firstname,
                      @RequestParam("lastname") String lastname){
        Person p = new Person(firstname,lastname);
        this.personService.add(p);
        return "redirect:/";
    }
    @GetMapping(value = "/update/{id}")
    public String ShowUpdate(@PathVariable("id") int id, ModelMap modelMap){

        modelMap.addAttribute("person",personService.onePerson(Integer.parseInt(String.valueOf(id))));

        return "update";
    }
    @PostMapping(value = "/update/{id}")
    public String update(@RequestParam("firstname") @Nullable String firstname,
                         @RequestParam("lastname") String lastname,
                         @PathVariable("id") int id){
        Person p = new Person(id,firstname,lastname);
        this.personService.update(Integer.parseInt(String.valueOf(id)),p);
      return "redirect:/";
    }

    @GetMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") int id){

        this.personService.delete(Integer.parseInt(String.valueOf(id)));
        return "redirect:/";
    }
}
