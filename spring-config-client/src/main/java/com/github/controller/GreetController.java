package com.github.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetController {

    @Value("${myprop.val}")
    private String myval;

    @GetMapping("/")
    public String greet(){
        return "Here is the value: "+myval;
    }
}
