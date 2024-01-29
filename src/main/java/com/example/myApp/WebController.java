package com.example.myApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
