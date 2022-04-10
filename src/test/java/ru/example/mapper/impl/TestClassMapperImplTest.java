package ru.example.mapper.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.example.mapper.TestClassMapper;
import ru.example.model.TestClass;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TestClassMapperImpl")
class TestClassMapperImplTest {

    private TestClassMapper testClassMapper;

    @BeforeEach
    void setUp() {
        testClassMapper = new TestClassMapperImpl(new TestClass());
    }

    @DisplayName("должен корректно преобразовывать TestClass в TestClassDto")
    @Test
    void shouldTransformedToDto() {
        assertAll(
                () -> assertNotNull(testClassMapper.toTestClassDto()),
                () -> assertEquals(testClassMapper.toTestClassDto().getTest(), "OK")
        );
    }
}