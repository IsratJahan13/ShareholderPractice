package com.example.shareholderPractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShareholderPracticeController {

    @GetMapping("/home")
    @CrossOrigin(origins = "http://localhost:5173") // removes CORS error, otherwise we can set proxy config in frontend
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome to shareholder API");
    }
}