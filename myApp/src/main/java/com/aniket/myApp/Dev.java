package com.aniket.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
    @Qualifier("laptop")
    private Computer com;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){

        com.compile();
        com.debug();
        System.out.println("Working on Awesome Project");
    }
}
