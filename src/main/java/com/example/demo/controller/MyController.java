package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Mathankumar R!";
    }
}
// docker run -p 8081:8081 -p 50000:500000 -d -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts