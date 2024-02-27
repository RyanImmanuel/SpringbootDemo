package com.example.Restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }

    //http://localhost:8080/add?a=3&b=4
    @GetMapping("/add")
    String add(@RequestParam int a, @RequestParam int b){
        int c = a + b;
        return "the sum is " + c;
    }
    @GetMapping("/weather/{cityName}")
    String getWeather(@PathVariable String cityName){
        return cityName + " weather is good";
    }
}
