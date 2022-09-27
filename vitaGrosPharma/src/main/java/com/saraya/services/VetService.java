package com.saraya.services;

import com.saraya.models.Specialty;
import com.saraya.models.Vet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VetService {
    private static  List<Vet> vets = new ArrayList<>();
    static {
        vets.add(new Vet( 1,"Ali", "Diallo",List.of(
                 new Specialty("Radiology"),  new Specialty("Dentist"))));
        vets.add(new Vet(2, "Ali", "Diallo",List.of(new Specialty("Genicology"),
                new Specialty("Radiology"),  new Specialty("Dentist"))));
        vets.add(new Vet(3, "Ali", "Diallo",List.of(new Specialty("Genicology"),
                new Specialty("Radiology"),  new Specialty("Dentist"))));
        vets.add(new Vet( 4,"Ali", "Diallo",List.of(
                new Specialty("Radiology"))));
        vets.add(new Vet(5, "Ali", "Diallo",List.of(new Specialty("Genicology"),
                 new Specialty("Dentist"))));


    }

    public List<Vet> getVets() {

        return vets;
    }

    public void add(Vet vet){
        vet.setId(maxId()+1);
        vets.add(vet);
    }

    public void update(int id,Vet vet){
        vets.set(this.findIndexById(id),vet);
    }

    public Vet findOneById(int id) {
        Optional<Vet> vet =  vets.stream().filter(o->o.getId()==id).findFirst();

        return vet.orElseThrow();
    }
    public int maxId(){
        Optional<Integer> id = vets.stream().map(Vet::getId).max(Integer::compare);
        return id.orElse(0);
    }
    public int findIndexById(int id){
        return  vets.indexOf(findOneById(id));
    }
}
