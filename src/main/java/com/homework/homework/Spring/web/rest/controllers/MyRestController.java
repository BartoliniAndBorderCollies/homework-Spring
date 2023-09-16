package com.homework.homework.Spring.web.rest.controllers;

import com.homework.homework.Spring.model.Furniture;
import com.homework.homework.Spring.service.MyService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {
    private final MyService myService;

    public MyRestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/hello")
    public ResponseEntity<Furniture> hello() {
        int number = myService.addNumber();
        String text = "Hi, it's me! You used this endpoint since app started: " + number + " times.";
        return new ResponseEntity<>(new Furniture("bed"), HttpStatusCode.valueOf(200));
    }
}
