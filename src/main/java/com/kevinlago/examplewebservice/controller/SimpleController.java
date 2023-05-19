package com.kevinlago.examplewebservice.controller;

import com.kevinlago.examplewebservice.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1")
public class SimpleController {
    @Autowired
    SimpleService service;

    @GetMapping
    public ResponseEntity<String> getString(
            @RequestParam("string") String string
    ) {
        try {
            return new ResponseEntity<>(service.getString(string), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
