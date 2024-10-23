package com.aniket.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Destop implements Computer {

    public void compile(){

        System.out.println("Compiling with 404 bugs but faster");
    }
    public void debug(){

        System.out.println("Debuging the 404 error");
    }
}
