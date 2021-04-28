package com.example.mappers.config;

import com.example.mappers.converters.CarMapper;
import com.example.mappers.converters.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;

@Configuration
public class AppConfig
{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    public void conversionService(GenericConversionService genericConversionService) {
        genericConversionService.addConverter(userMapper);
        genericConversionService.addConverter(carMapper);
    }
}
