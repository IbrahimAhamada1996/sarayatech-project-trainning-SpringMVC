package com.saraya.models;

public class Manager{
    private long id;
    private String firstName;
    private String lastName;
    private static long idGenerate=1;
    public Manager(String firstName, String lastName) {
        this.id = idGenerate;
        this.firstName = firstName;
        this.lastName = lastName;
        idGenerate++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
