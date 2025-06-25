package com.domain.devfood.adapter.web.controller;

import com.domain.devfood.adapter.web.dto.RegisterUserRequest;
import com.domain.devfood.adapter.web.dto.UserResponse;
import com.domain.devfood.adapter.web.mapper.UserWebMapper;
import com.domain.devfood.application.dto.RegisterUserInput;
import com.domain.devfood.application.service.RegisterUserService;
import com.domain.devfood.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final RegisterUserService registerUserService;

    @PostMapping
    public ResponseEntity<UserResponse> register(@RequestBody RegisterUserRequest request) {
        var input = new RegisterUserInput(request.name, request.email, request.password);
        User created = registerUserService.execute(input);
        return ResponseEntity.ok(UserWebMapper.toResponse(created));
    }
}
