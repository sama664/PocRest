package org.soumitra.poc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestAPi {

    @GetMapping("/name")
    public String name(){
        return "I am Soumitra";
    }
}
