package com.saraya.services;

import com.saraya.models.Specialty;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class SpecialtyService {
    private static List<Specialty> specialties = new ArrayList<>();
    static {
        specialties.add(new Specialty( "Radiology"));
    }

    public List<Specialty> getSpecialties() {

        return specialties;
    }

    public void add(Specialty specialty){
        specialty.setId(maxId()+1);
        specialties.add(specialty);
    }

    public void update(int id,Specialty specialty){
        specialties.set(this.findIndexById(id),specialty);
    }

    public Specialty findOneById(int id) {
        Optional<Specialty> specialty =  specialties.stream().filter(s->s.getId()==id).findFirst();

        return specialty.orElseThrow();
    }
    public int maxId(){
        Optional<Integer> id = specialties.stream().map(Specialty::getId).max(Integer::compare);
        return id.orElse(0);
    }
    public int findIndexById(int id){
        return  specialties.indexOf(findOneById(id));
    }
}
