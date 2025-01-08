package com.vikas.spring_sec_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet() {
        return "hello World";
    }

    @GetMapping("about")
    public String about() {
        return "Vikas";
    }



}
