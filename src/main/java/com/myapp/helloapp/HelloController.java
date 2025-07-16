package com.myapp.helloapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "My First SpringBoot Ap that will be used to deploy at1111 azure appservice using Git Hub Action Slot Wise Devs";
    }
    
    }

    
    

