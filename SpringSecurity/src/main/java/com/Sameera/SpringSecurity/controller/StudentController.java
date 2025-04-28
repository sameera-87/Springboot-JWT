package com.Sameera.SpringSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @RequestMapping("/")
    public String helloMessasge(){
        return "The home page";
    }
}
