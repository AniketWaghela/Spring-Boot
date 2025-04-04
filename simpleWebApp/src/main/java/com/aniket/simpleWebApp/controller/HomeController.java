package com.aniket.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("Heloo ........");
        return "Welcome to Aniket!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "this is a about page.....";
    }
}
