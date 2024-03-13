package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/hello")
    public String test() {
        System.out.println("Hello World");
        return "Hello world";
    }
}
