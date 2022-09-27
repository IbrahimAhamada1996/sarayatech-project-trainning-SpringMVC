package com.saraya.services;

import com.saraya.models.Owner;
import com.saraya.models.Pet;
import com.saraya.models.Visit;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class VisitService {
    private static List<Visit> visits = new ArrayList<>();
    static {
        visits.add(new Visit( LocalDate.now(), "it's cool"));
    }

    public List<Visit> getVisits() {

        return visits;
    }

    public void add(Visit Visit){
        Visit.setId(maxId()+1);
        visits.add(Visit);
    }

    public void update(int id,Visit pet){
        visits.set(this.findIndexById(id),pet);
    }

    public Visit findOneById(int id) {
        Optional<Visit> Visit =  visits.stream().filter(o->o.getId()==id).findFirst();

        return Visit.orElseThrow();
    }
    public int maxId(){
        Optional<Integer> id = visits.stream().map(Visit::getId).max(Integer::compare);
        return id.orElse(0);
    }
    public int findIndexById(int id){
        return  visits.indexOf(findOneById(id));
    }

    public void delete(int id) {
        visits.remove(findIndexById(id));
    }
}
