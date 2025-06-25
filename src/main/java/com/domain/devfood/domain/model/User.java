package com.domain.devfood.domain.model;

import java.util.Objects;

public class User {

    private final String id;
    private String name;
    private String email;
    private String passwordHash;

    public User(String id, String name, String email, String passwordHash) {

        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");

        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Email cannot be null or blank");

        if (passwordHash == null || passwordHash.isBlank())
            throw new IllegalArgumentException("PasswordHash cannot be null or blank");

        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String email) {
        if (email == null || email.isBlank()) throw new IllegalArgumentException("Email cannot be null or blank");
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void updatePasswordHash(String passwordHash) {
        if (passwordHash == null || passwordHash.isBlank())
            throw new IllegalArgumentException("PasswordHash cannot be null or blank");
        this.passwordHash = passwordHash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
