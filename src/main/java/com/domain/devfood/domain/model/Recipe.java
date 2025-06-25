package com.domain.devfood.domain.model;

import java.util.List;
import java.util.Objects;

public class Recipe {

    private final String id;
    private String title;
    private String description;
    private List<RecipeIngredient> ingredients;
    private String instructions;
    private final String createdByUserId;

    public Recipe(
            String id,
            String title,
            String description,
            List<RecipeIngredient> ingredients,
            String instructions,
            String createdByUserId
    ) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");

        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be null or blank");

        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be null or blank");

        if (ingredients == null || ingredients.isEmpty())
            throw new IllegalArgumentException("Ingredients cannot be null or empty");

        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Instructions cannot be null or blank");

        if (createdByUserId == null || createdByUserId.isBlank())
            throw new IllegalArgumentException("User ID is required");

        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.createdByUserId = createdByUserId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be null or blank");
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be null or blank");
        this.description = description;
    }

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void updateIngredients(List<RecipeIngredient> ingredients) {
        if (ingredients == null || ingredients.isEmpty())
            throw new IllegalArgumentException("Ingredients cannot be null or empty");
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void updateInstructions(String instructions) {
        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Instructions cannot be null or blank");
        this.instructions = instructions;
    }

    public String getCreatedByUserId() {
        return createdByUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
