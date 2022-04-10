package ru.example.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.example.dto.TestClassDto;
import ru.example.mapper.TestClassMapper;
import ru.example.model.TestClass;

@Component
public class TestClassMapperImpl implements TestClassMapper {

    private final TestClass testClass;

    @Autowired
    public TestClassMapperImpl(TestClass testClass) {
        this.testClass = testClass;
    }

    @Override
    public TestClassDto toTestClassDto() {
        if (testClass == null) {
            return null;
        }

        return new TestClassDto(testClass.getTest());
    }
}
