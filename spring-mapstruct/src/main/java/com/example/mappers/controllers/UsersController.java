package com.example.mappers.controllers;

import com.example.mappers.converters.CarMapper;
import com.example.mappers.converters.UserMapper;
import com.example.mappers.dto.CarDto;
import com.example.mappers.dto.UserDto;
import com.example.mappers.model.Car;
import com.example.mappers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/users")
@RestController
public class UsersController {

    private static final List<Car> CARS = List.of(
            Car.from("BMW", 2021),
            Car.from("BMW", 2021));

    private static final List<User> USERS = List.of(
            User.from("Miztli", 30, Car.from("BMW", 2021)),
            User.from("Dan", 60, Car.from("BMW", 2021)));

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<UserDto> findAllUsers() {
        return USERS.stream()
                .map(user -> userMapper.convert(user))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/cars")
    public List<CarDto> findAllCars() {
        return CARS.stream()
                .map(car -> carMapper.convert(car))
                .collect(Collectors.toList());
    }
}
