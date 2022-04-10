package ru.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.dto.StatusTestClassDto;
import ru.example.mapper.MyMapper;
import ru.example.model.StatusTestClass;
import ru.example.service.StatusTestClassService;

@Service
public class StatusTestClassServiceImpl implements StatusTestClassService {

    private final MyMapper myMapper;

    @Autowired
    public StatusTestClassServiceImpl(MyMapper myMapper) {
        this.myMapper = myMapper;
    }

    @Override
    public StatusTestClassDto getTestClassDto(StatusTestClass statusTestClass) {
        return myMapper.toTestClassDto(statusTestClass);
    }
}
