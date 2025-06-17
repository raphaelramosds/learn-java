package com.raphaeldev.first_spring_app.controller;

import com.raphaeldev.first_spring_app.domain.User;
import com.raphaeldev.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    // Manual injection of helloWorldService is optional because we are using
    // @Autowired
    // public HelloWorldController(HelloWorldService helloWorldService) {
    // this.helloWorldService = helloWorldService;
    // }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Raphael");
    }

    @PostMapping()
    public String helloWorldPost(
            @RequestParam(value = "filter", defaultValue = "none") String filter,
            @RequestBody User body) {

        if (!filter.equals("none"))
            return filter;

        return "Hello, " + body.getName() + " you have tried to filter: " + filter;
    }

    @PostMapping("/{id}")
    public String helloWorldIdPost(
            @PathVariable("id") String id,
            @RequestBody User body) {
        return "Hello, " + body.getName() + " your ID is " + id;
    }

}