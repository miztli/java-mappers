package com.example.mappers.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

// rename generated service adapter name / package name
@MapperConfig(componentModel = "spring", uses = CustomAdapter.class)
@SpringMapperConfig(
    // conversionServiceAdapterPackage = "com.example.mappers.adapter",
    conversionServiceAdapterClassName = "CustomAdapter"
    // conversionServiceBeanName = "webConversionService"
)
public interface MapperSpringConfig {
}
