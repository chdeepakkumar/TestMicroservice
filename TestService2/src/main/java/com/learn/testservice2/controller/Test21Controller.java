package com.learn.testservice2.controller;

import com.learn.testservice2.dto.Test21;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test21")
public class Test21Controller {
    @GetMapping
    public ResponseEntity<Test21> firstMethod() {
        return new ResponseEntity<>(new Test21("Test21", 200), HttpStatus.OK);
    }
}
