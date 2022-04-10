package ru.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.dto.StatusTestClassDto;
import ru.example.model.StatusTestClass;
import ru.example.service.StatusTestClassService;

@RestController
public class ExampleController {

    private final StatusTestClassService statusTestClassService;

    @Autowired
    public ExampleController(StatusTestClassService statusTestClassService) {
        this.statusTestClassService = statusTestClassService;
    }

    @GetMapping("/api/v1/test")
    public ResponseEntity<StatusTestClassDto> simpleGetEndpoint() {
        return new ResponseEntity<>(statusTestClassService.getTestClassDto(new StatusTestClass()), HttpStatus.OK);
    }
}
