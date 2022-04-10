package ru.example.mapper;

import org.mapstruct.Mapper;
import ru.example.dto.StatusTestClassDto;
import ru.example.model.StatusTestClass;

@Mapper
public interface MyMapper {

    StatusTestClassDto toTestClassDto(StatusTestClass statusTestClass);
}
