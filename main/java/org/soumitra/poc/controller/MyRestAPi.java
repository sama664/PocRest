package org.soumitra.poc.controller;

import org.soumitra.poc.configuration.SetConfiguration;
import org.soumitra.poc.entity.Users;
import org.soumitra.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestAPi {

    @Autowired
    SetConfiguration setConfiguration;

    @Autowired
    UserService userService;



    @GetMapping("/name")
    public String name(){
        return setConfiguration.name;
    }

    @PostMapping("/addname")
    public void namesList(@RequestBody Users users){
        System.out.println(users.getName());
        userService.saveUsersList(users);
    }
    @GetMapping("/allUsers")
    public List<Users> allUsers(){

        return userService.allUserList();
    }
}
