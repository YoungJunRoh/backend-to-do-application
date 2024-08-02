package com.example.backend_to_do_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String HelloWorld(){
        return "To-do-Application version 2";
    }
}
