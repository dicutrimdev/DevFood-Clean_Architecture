package com.domain.devfood.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private String passwordHash;
}
