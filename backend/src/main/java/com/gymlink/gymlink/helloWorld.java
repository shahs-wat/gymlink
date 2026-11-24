package com.gymlink.gymlink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @GetMapping("/")
    public String hello(){
        return "HELLO WORLD!";
    }
}
