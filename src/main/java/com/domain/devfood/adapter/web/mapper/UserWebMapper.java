package com.domain.devfood.adapter.web.mapper;

import com.domain.devfood.adapter.web.dto.RegisterUserRequest;
import com.domain.devfood.adapter.web.dto.UserResponse;
import com.domain.devfood.domain.model.User;

public class UserWebMapper {

    public static User toDomain(RegisterUserRequest request) {
        return new User(null, request.name, request.email, request.password);
    }

    public static UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();
        response.id = user.getId();
        response.name = user.getName();
        response.email = user.getEmail();
        return response;
    }
}
