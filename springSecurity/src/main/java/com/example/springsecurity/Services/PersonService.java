package com.example.springsecurity.Services;

import com.example.springsecurity.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class PersonService {

    private static List<Person> persons=new ArrayList<>();
    static {
        persons.add(new Person(1,"ibrahim","Ahamada"));
        persons.add(new Person(2,"Li","Karim"));
        persons.add(new Person(3,"Omar","Hassane"));

        persons.add(new Person(4,"ibra","hamada"));
    }

    public  List<Person> getPersons() {
        return persons;
    }

    public void add(Person p){
      int id =  this.getPersons().stream().mapToInt(Person::getId).max().getAsInt();
      id++;
      p.setId(id);
      this.getPersons().add(p);
    }
    public void delete(int id){
        this.getPersons().remove(onePerson(id));
    }

    public Person onePerson(int id){
        return this.getPersons().stream().filter(p1->p1.getId()==id).findFirst().get();
    }

    public void update(int id,Person p){
        int index = this.getPersons().indexOf(this.onePerson(id));
        this.getPersons().set(index,p);
    }
}
