package com.domain.devfood.domain.repository;

import com.domain.devfood.domain.model.Recipe;

import java.util.Optional;

public interface RecipeRepository {

    void save(Recipe recipe);

    Optional<Recipe> findById(String id);
}
