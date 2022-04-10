package ru.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ru.example.dto.StatusTestClassDto;
import ru.example.model.StatusTestClass;
import ru.example.service.StatusTestClassService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@WebMvcTest
class ExampleControllerTest {

    @MockBean
    private StatusTestClassService statusTestClassService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenTestClassDto() throws Exception {
        when(statusTestClassService.getTestClassDto(new StatusTestClass())).thenReturn(new StatusTestClassDto("OK"));

        mockMvc.perform(get("/api/v1/test"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}