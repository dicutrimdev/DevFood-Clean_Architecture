package com.domain.devfood.application.service;

import com.domain.devfood.application.dto.RegisterUserInput;
import com.domain.devfood.domain.model.User;
import com.domain.devfood.domain.repository.UserRepository;

import java.util.UUID;

public class RegisterUserService implements RegisterUserUseCase {

    private final UserRepository userRepository;

    public RegisterUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void execute(RegisterUserInput input) {
        if (userRepository.existsByEmail(input.email()))
            throw new IllegalArgumentException("Email already in use.");
        String id = UUID.randomUUID().toString();
        User user = new User(id, input.name(), input.email(), input.passwordHash());
        userRepository.save(user);
    }
}
