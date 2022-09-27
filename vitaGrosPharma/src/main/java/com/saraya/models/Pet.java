package com.saraya.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pet {

    private int id=1;
    private String name;
    private LocalDate dateOfBirth;
    private PetType petType;
    private List<Visit> visits= new ArrayList<>();
    private Owner owner;

    public Pet(String name, LocalDate dateOfBirth, PetType petType, Owner owner) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.owner = owner;
    }

    public Pet(String name, LocalDate  dateOfBirth, PetType petType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
    }

    public Pet(String name, LocalDate  dateOfBirth, List<Visit> visits) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.visits = visits;
    }

    public Pet(String name, LocalDate  dateOfBirth, PetType petType, List<Visit> visits) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.visits = visits;
    }

    public Pet(int id, String name, LocalDate dateOfBirth, PetType petType, Owner owner) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate  getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate  dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void addVisit(Visit v){

        visits.add(v);
    }
}
