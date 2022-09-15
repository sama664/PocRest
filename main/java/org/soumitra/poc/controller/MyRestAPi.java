package org.soumitra.poc.controller;

import org.soumitra.poc.configuration.SetConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestAPi {

    @Autowired
    SetConfiguration setConfiguration;

    @GetMapping("/name")
    public String name(){
        return setConfiguration.name;
    }
}
