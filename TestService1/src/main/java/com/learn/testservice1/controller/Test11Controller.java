package com.learn.testservice1.controller;

import com.learn.testservice1.dto.Test11;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test11")
public class Test11Controller {
    @GetMapping
    public ResponseEntity<Test11> firstMethod() {
        return new ResponseEntity<>(new Test11("Test11", 100), HttpStatus.OK);
    }
}
