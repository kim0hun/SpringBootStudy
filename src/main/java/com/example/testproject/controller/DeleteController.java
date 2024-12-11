package com.example.testproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    // http://localhost:8080/api/v1/delete-api/variable1/{variable}
    @DeleteMapping(value = "/variable/{variable}")
    public String DeleteVariable(@PathVariable String variable){
        return variable;
    }
}
