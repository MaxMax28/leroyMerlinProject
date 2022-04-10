package ru.example.dto;

import org.springframework.stereotype.Component;

@Component
public class TestClassDto {

    private String test;

    public TestClassDto() {
    }

    public TestClassDto(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
