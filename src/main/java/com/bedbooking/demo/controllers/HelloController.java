package com.bedbooking.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello.message}")
    private String helloMessage;


    @GetMapping("/hello")
    public String helloWorld() {
        return helloMessage;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Let's learn Docker with GitHub actions!";
    }
}
