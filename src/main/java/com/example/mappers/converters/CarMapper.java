package com.example.mappers.converters;

import com.example.mappers.config.MapperSpringConfig;
import com.example.mappers.dto.CarDto;
import com.example.mappers.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface CarMapper extends Converter<Car, CarDto> {
    @Override
    @Mapping(target = "brand", source = "model")
    CarDto convert(Car car);
}
