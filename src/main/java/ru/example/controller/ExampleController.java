package ru.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.dto.TestClassDto;
import ru.example.service.TestClassService;

@RestController
public class ExampleController {

    private final TestClassService testClassService;

    @Autowired
    public ExampleController(TestClassService testClassService) {
        this.testClassService = testClassService;
    }

    @GetMapping("/api/v1/test")
    public TestClassDto simpleGetEndpoint() {
        return testClassService.getTestClassDto();
    }
}
