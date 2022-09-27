package com.saraya.models;

public enum PetType {
  Bird("Bird"),CAT("Cat"),DOG("Dog"),HAMSTER("Hamster");

    private  String name;


    PetType(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
