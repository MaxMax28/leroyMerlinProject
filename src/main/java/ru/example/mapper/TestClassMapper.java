package ru.example.mapper;

import org.mapstruct.Mapper;
import ru.example.dto.TestClassDto;

@Mapper
public interface TestClassMapper {

    TestClassDto toTestClassDto();
}
