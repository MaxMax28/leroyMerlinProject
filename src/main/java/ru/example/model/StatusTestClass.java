package ru.example.model;

import org.springframework.stereotype.Component;

@Component
public final class StatusTestClass {

    private String test = "OK";

    public String getTest() {
        return test;
    }
}
