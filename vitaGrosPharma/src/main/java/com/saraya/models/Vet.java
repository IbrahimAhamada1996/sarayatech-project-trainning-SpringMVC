package com.saraya.models;

import java.util.List;

public class Vet {
    private int id;
    private String firstname;
    private String lastname;
    private List<Specialty> specialties;

    public Vet(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Vet(String firstname, String lastname, List<Specialty> specialties) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialties = specialties;
    }

    public Vet(int id, String firstname, String lastname, List<Specialty> specialties) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialties = specialties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", specialties=" + specialties +
                '}';
    }
}
