package com.saraya.services;

import com.saraya.models.User;
import com.saraya.models.Vet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();
    static{
        users.add(new User("admin@gmail.com","admin"));
    }

    public List<User> getUsers() {
        return users;
    }
    public void add(User user){
        user.setId(maxId()+1);
        users.add(user);
    }

    public User OneFind(User user){
       Optional<User> userOptional =  users.stream().filter(u->u.getEmail().equalsIgnoreCase(user.getEmail())&& u.getPassword().equals(user.getPassword())).findAny();
        if(userOptional.isEmpty())
            return null;
        return userOptional.get();
    }

    public void update(int id,User user){
        users.set(this.findIndexById(id),user);
    }

    public User findOneById(int id) {
        Optional<User> user =  users.stream().filter(o->o.getId()==id).findFirst();

        return user.orElseThrow();
    }
    private int maxId(){
        Optional<Integer> id = users.stream().map(User::getId).max(Integer::compare);
        return id.orElse(0);
    }
    private int findIndexById(int id){
        return  users.indexOf(findOneById(id));
    }


}
