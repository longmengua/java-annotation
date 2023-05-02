package com.example.annotation.controller;

import com.example.annotation.annotation.CKS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {
    @GetMapping("")
    @CKS
    public String demo() {
        return "verified successfully";
    }
}
