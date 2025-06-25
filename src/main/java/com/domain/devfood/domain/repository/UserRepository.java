package com.domain.devfood.domain.repository;

import com.domain.devfood.domain.model.User;

public interface UserRepository {

    void save(User user);

    boolean existsByEmail(String email);
}
