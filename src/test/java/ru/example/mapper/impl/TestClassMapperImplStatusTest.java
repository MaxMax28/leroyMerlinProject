package ru.example.mapper.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.example.dto.StatusTestClassDto;
import ru.example.mapper.MyMapper;
import ru.example.model.StatusTestClass;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MyMapperImpl")
class TestClassMapperImplStatusTest {

    private MyMapper myMapper;

    @BeforeEach
    void setUp() {
        myMapper = new MyMapperImpl();
    }

    @DisplayName("должен корректно преобразовывать StatusTestClass в StatusTestClassDto")
    @Test
    void shouldTransformedToDto() {
        assertAll(
                () -> assertNotNull(myMapper.toTestClassDto(new StatusTestClass())),
                () -> assertEquals(myMapper.toTestClassDto(new StatusTestClass()).getTest(), "OK"),
                () -> assertEquals(myMapper.toTestClassDto(new StatusTestClass()).getClass(), StatusTestClassDto.class)
        );
    }
}