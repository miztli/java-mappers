package com.example.mappers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.mapstruct.extensions.spring", "com.example.mappers"})
public class MappersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappersApplication.class, args);
	}

}
