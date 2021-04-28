package com.example.mappers.converters;

import com.example.mappers.config.MapperSpringConfig;
import com.example.mappers.dto.UserDto;
import com.example.mappers.model.User;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface UserMapper extends Converter<User, UserDto> {

    @Override
    UserDto convert(User user);
}
