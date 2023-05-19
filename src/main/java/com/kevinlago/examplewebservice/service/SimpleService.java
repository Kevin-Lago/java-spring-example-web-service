package com.kevinlago.examplewebservice.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String getString(String string) {
        return "Simple " + string;
    }
}
