package ru.example.mapper.impl;

import org.springframework.stereotype.Component;
import ru.example.dto.StatusTestClassDto;
import ru.example.mapper.MyMapper;
import ru.example.model.StatusTestClass;

@Component
public class MyMapperImpl implements MyMapper {

    @Override
    public StatusTestClassDto toTestClassDto(StatusTestClass statusTestClass) {
        if (statusTestClass == null) {
            return new StatusTestClassDto();
        }

        return new StatusTestClassDto(statusTestClass.getTest());
    }
}
