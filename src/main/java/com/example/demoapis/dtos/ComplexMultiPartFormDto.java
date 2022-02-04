package com.example.demoapis.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public record ComplexMultiPartFormDto(
    @NotBlank String firstName,
    String lastName,
    @Min(1) int age
) { }
