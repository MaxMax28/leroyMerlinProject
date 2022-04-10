package ru.example.model;

import org.springframework.stereotype.Component;

@Component
public final class TestClass {

    private String test = "OK";

    public String getTest() {
        return test;
    }
}
