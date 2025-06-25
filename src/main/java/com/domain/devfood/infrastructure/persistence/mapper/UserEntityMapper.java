package com.domain.devfood.infrastructure.persistence.mapper;

import com.domain.devfood.domain.model.User;
import com.domain.devfood.infrastructure.persistence.entity.UserEntity;

public class UserEntityMapper {

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getEmail(), user.getPasswordHash());
    }

    public static User toDomain(UserEntity entity) {
        return new User(entity.getId(), entity.getName(), entity.getEmail(), entity.getPasswordHash());
    }
}
