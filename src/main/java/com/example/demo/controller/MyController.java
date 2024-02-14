package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Dear Mathankumar Ramasamy, Don't feel low, You will get a great Job!";
    }
}