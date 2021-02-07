package com0.jefferson.springweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String getCustomer(){
        return "Hello Customer"+new Date();
    }
}
