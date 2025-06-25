package com.domain.devfood.domain.model;

import java.util.Objects;

public class Ingredient {

    private final String id;
    private String name;

    public Ingredient(String id, String name) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");

        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
