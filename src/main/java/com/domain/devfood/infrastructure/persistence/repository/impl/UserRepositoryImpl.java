package com.domain.devfood.infrastructure.persistence.repository.impl;

import com.domain.devfood.domain.model.User;
import com.domain.devfood.domain.repository.UserRepository;
import com.domain.devfood.infrastructure.persistence.mapper.UserEntityMapper;
import com.domain.devfood.infrastructure.persistence.repository.jpa.SpringDataUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final SpringDataUserRepository springDataUserRepository;

    public UserRepositoryImpl(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }

    @Override
    public void save(User user) {
        springDataUserRepository.save(UserEntityMapper.toEntity(user));
    }

    @Override
    public boolean existsByEmail(String email) {
        return springDataUserRepository.existsByEmail(email);
    }
}
