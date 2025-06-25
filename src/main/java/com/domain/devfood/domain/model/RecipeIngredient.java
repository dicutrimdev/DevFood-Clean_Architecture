package com.domain.devfood.domain.model;

import java.util.Objects;

public class RecipeIngredient {

    private final String id;
    private final String recipeId;
    private final String ingredientId;
    private double quantity;
    private String unit;

    public RecipeIngredient(String id, String recipeId, String ingredientId, double quantity, String unit) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");

        if (recipeId == null || recipeId.isBlank())
            throw new IllegalArgumentException("Recipe ID is required");

        if (ingredientId == null || ingredientId.isBlank())
            throw new IllegalArgumentException("Ingredient ID is required");

        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");

        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException("Unit is required");

        this.id = id;
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void updateQuantity(double quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void updateUnit(String unit) {
        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException("Unit is required");
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
