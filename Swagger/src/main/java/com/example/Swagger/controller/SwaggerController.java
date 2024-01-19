package com.example.Swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class SwaggerController {
    @GetMapping("/check")
    public String checkService(){
        return "Service is up and running !!!!";
    }
}

