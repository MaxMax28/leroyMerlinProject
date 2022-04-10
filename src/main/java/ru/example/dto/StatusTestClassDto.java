package ru.example.dto;

public class StatusTestClassDto {

    private String test;

    public StatusTestClassDto(String test) {
        this.test = test;
    }

    public StatusTestClassDto() {
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}