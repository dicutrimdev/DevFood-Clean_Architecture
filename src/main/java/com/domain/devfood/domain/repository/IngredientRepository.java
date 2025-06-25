package com.domain.devfood.domain.repository;

import com.domain.devfood.domain.model.Ingredient;

import java.util.List;

public interface IngredientRepository {

    void save(Ingredient ingredient);

    List<Ingredient> findAll();
}
