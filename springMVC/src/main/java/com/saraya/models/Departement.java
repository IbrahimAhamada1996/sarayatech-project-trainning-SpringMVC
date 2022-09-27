package com.saraya.models;

public class Departement {

    private long id;
    private String name;
    private String manager;
    private static long idGenerate=1;
    public Departement(String name) {
       this.id = idGenerate;
        this.name = name;
        idGenerate++;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
