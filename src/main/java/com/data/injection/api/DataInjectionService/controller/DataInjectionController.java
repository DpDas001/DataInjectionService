package com.data.injection.api.DataInjectionService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataInjectionController {

    @PostMapping("/pull")
    public ResponseEntity<String> pullData(){

        return new ResponseEntity<>(HttpStatus.OK);

    }
}
