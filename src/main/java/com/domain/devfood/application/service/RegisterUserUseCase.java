package com.domain.devfood.application.service;

import com.domain.devfood.application.dto.RegisterUserInput;
import com.domain.devfood.domain.model.User;

public interface RegisterUserUseCase {
    User execute(RegisterUserInput input);
}
