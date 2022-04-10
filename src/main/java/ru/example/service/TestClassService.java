package ru.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.dto.TestClassDto;
import ru.example.mapper.TestClassMapper;

@Service
public class TestClassService {

    private final TestClassMapper testClassMapper;

    @Autowired
    public TestClassService(TestClassMapper testClassMapper) {
        this.testClassMapper = testClassMapper;
    }

    public TestClassDto getTestClassDto() {
        return testClassMapper.toTestClassDto();
    }
 }
