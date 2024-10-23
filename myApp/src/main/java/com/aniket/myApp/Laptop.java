package com.aniket.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){

        System.out.println("Compiling with 404 bugs");
    }
    public void debug(){

        System.out.println("Debuging the 404 error");
    }
}
