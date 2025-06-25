package com.domain.devfood.application.service;

import com.domain.devfood.application.dto.RegisterUserInput;

public interface RegisterUserUseCase {
    void execute(RegisterUserInput input);
}
