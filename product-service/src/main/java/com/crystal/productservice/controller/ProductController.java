package com.crystal.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
   // @Value("${dbsetting}")
    @Value("dbsetting")
    private String dbString;

    @GetMapping("/")
    public String display(){
        System.out.println("It workds ");
        return "It works"+dbString;
    }
}
