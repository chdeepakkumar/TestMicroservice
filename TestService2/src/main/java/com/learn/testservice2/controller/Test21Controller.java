package com.learn.testservice2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test21")
public class Test21Controller {
    @GetMapping
    public ResponseEntity<String> firstMethod() {
        return new ResponseEntity<>("<h1 style='color:red'>Hello</h1>", HttpStatus.OK);
    }
}
