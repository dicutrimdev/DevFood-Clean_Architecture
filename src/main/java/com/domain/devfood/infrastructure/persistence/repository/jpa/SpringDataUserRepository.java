package com.domain.devfood.infrastructure.persistence.repository.jpa;

import com.domain.devfood.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUserRepository extends JpaRepository<UserEntity, String> {
    boolean existsByEmail(String email);
}
