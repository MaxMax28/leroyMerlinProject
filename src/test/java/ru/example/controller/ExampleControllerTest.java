package ru.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import ru.example.dto.TestClassDto;
import ru.example.mapper.TestClassMapper;
import ru.example.mapper.impl.TestClassMapperImpl;
import ru.example.model.TestClass;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
class ExampleControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenTestClassDto() throws Exception {
        mockMvc.perform(
                get("/api/v1/test"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(objectMapper.writeValueAsString(new TestClassMapperImpl(new TestClass()).toTestClassDto())));
    }
}