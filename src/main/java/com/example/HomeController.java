package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String getHome(){
        return "Home page";
    }
    @GetMapping("/secured")
    public String getSecured(){
        return "Secured page";
    }
}
