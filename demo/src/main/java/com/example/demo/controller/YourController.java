package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YourController {

    @GetMapping("/dane")
    public ResponseEntity<String> getDane() {
        return ResponseEntity.ok("Dane z beckendu");
    }
}
