package com.saraya.security;

import com.saraya.models.User;
import com.saraya.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes
public class Authentification {
    @Autowired
    private UserService userService;
    public boolean login(User user){
        return this.userService.OneFind(user) != null? true:false;

    }
}
