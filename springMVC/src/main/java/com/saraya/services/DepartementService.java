package com.saraya.services;

import com.saraya.models.Departement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartementService {

    private static List<Departement> departements = new ArrayList<>();

    static {
        departements.add(new Departement("Ibrahim"));
        departements.add(new Departement("Karim"));
        departements.add(new Departement("Sara"));
        departements.add(new Departement("Ali"));
        departements.add(new Departement("Omar"));
    }

    public List<Departement> getDepartements() {
        return departements;
    }
    public Departement getDepartement(long id){
//        departements.get(departements.indexOf(new Departement("informatique")));
        return this.departements.stream().filter(d->d.getId()==id).findFirst().get();
    }
}
