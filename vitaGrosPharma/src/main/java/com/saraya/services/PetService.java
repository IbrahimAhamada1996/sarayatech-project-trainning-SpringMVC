package com.saraya.services;

import com.saraya.models.Pet;
import com.saraya.models.PetType;
import com.saraya.models.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PetService {

    private static List<Pet> pets = new ArrayList<>();

    private OwnerService ownerService = new OwnerService();


    public List<Pet> getPets() {
        
        return pets;
    }

    public void add(Pet pet){

        pet.setId(maxId()+1);

        pets.add(pet);
    }
    public Pet add(Pet pet, Visit visit){
        pet.addVisit(visit);

        return pets.set(findIndexById(pet.getId()),pet);
    }

    public void update(int id,Pet pet){
        pet.setId(id);
        pets.set(this.findIndexById(id),pet);
    }

    public Pet findOneById(int id) {
        Optional<Pet> Pet =  pets.stream().filter(o->o.getId()==id).findFirst();

        return Pet.orElseThrow();
    }
    public int maxId(){
        Optional<Integer> id = pets.stream().map(Pet::getId).max(Integer::compare);
        return id.orElse(1);
    }
    public int findIndexById(int id){
        return  pets.indexOf(findOneById(id));
    }
    
    public List<Pet> findByOwnerId(int id){

        return pets.stream().filter(p->(p.getId()>0 && p.getOwner() !=null && p.getOwner().getId()==id)).collect(Collectors.toList());
    }
}
