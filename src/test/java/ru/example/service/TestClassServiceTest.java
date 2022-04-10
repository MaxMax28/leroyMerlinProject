package ru.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ru.example.dto.TestClassDto;
import ru.example.mapper.TestClassMapper;
import ru.example.mapper.impl.TestClassMapperImpl;
import ru.example.model.TestClass;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Сервис TestClassService")
class TestClassServiceTest {

//    @Mock
//    private TestClassMapper testClassMapper;

    private TestClassService testClassService;

    @BeforeEach
    void setUp() {
        testClassService = new TestClassService(new TestClassMapperImpl(new TestClass()));
    }

    @DisplayName("должен возвращать TestClassDto")
    @Test
    void shouldTransformedToDto() {

        assertEquals(testClassService.getTestClassDto().getClass(), TestClassDto.class);
    }

}