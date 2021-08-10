package com.poype.springmvc.filter;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void sayHallo() {
        System.out.println("TestService#sayHallo is invoked");
    }
}
