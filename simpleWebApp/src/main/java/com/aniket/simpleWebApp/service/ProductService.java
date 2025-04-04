package com.aniket.simpleWebApp.service;

import com.aniket.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101 ,"Iphone" ,50_000),
            new Product(102,"canon Camera",70_000),
            new Product(103 ,"Shure Mic" ,10_000)
    );
    public List<Product> getProducts(){
        return products;
    }
}
