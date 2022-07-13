package com.example.branchestest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {



    @GetMapping
    public String sayWelcome(){


        return "Welcome to my main Branch";

    }




}
