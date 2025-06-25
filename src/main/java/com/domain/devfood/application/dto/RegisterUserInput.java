package com.domain.devfood.application.dto;

public record RegisterUserInput(String name, String email, String passwordHash) {
}
