package com.vikas.app.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling in Desktop");
    }
}
