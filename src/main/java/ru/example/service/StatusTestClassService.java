package ru.example.service;

import ru.example.dto.StatusTestClassDto;
import ru.example.model.StatusTestClass;

public interface StatusTestClassService {
    StatusTestClassDto getTestClassDto(StatusTestClass statusTestClass);
}
