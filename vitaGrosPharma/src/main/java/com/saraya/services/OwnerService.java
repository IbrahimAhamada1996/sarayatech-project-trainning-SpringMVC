package com.saraya.services;

import com.saraya.models.Owner;
import com.saraya.models.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OwnerService {

    private static List<Owner> owners = new ArrayList<>();
    static {
        owners.add(new Owner("Ibrahim","Ahamada","Libet 6 ext","Dakar","77 823 63 34"));
    }

    public List<Owner> getOwners() {
        return owners;
    }
    public boolean add(Owner owner){
       owner.setId(maxId()+1);
       return owners.add(owner);
    }
    public Owner add(Owner owner, Pet p){
        owner.addPet(p);

        return owners.set(findIndexById(owner.getId()),owner);
    }
    public void update(int id, Owner owner){
        owner.setId(id);
        owners.set(this.findIndexById(id),owner);
    }

    public Owner findOneById(int id) {
       Optional<Owner> owner =  owners.stream().filter(o->o.getId()==id).findFirst();

       return owner.orElseThrow();
    }
    private int maxId(){
        Optional<Integer> id = owners.stream().map(Owner::getId).max(Integer::compare);
        return id.orElse(1);
    }
    private int findIndexById(int id){
      return  owners.indexOf(findOneById(id));
    }

    public List<Owner> searchByLastname(String lastname){
        return owners.stream().filter(o->o.getLastname().equalsIgnoreCase(lastname)).collect(Collectors.toList());
    }
     public  void delete(int id){
        owners.remove(findIndexById(id));
     }

    public static void setOwners(List<Owner> owners) {
        OwnerService.owners = owners;
    }

    public void addPets(int id,Pet addPet) {
        findOneById(id).setPets(List.of(addPet));

        this.update(findIndexById(id),findOneById(id));
    }


}
