package com.example.branchestest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {


    public String sayWelcome(){


        return "Welcome to my new Branch";
    }





}
