package com.recipe.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Byte[] image;

    public Recipe() {
    }

    public Recipe(Integer prepTime, Integer cookTime, Integer servings,
                  String source, String url, String directions,
                  Difficulty difficulty, Byte[] image) {
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
        this.source = source;
        this.url = url;
        this.directions = directions;
        this.difficulty = difficulty;
        this.image = image;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(prepTime, recipe.prepTime) && Objects.equals(cookTime, recipe.cookTime) && Objects.equals(servings, recipe.servings) && Objects.equals(source, recipe.source) && Objects.equals(url, recipe.url) && Objects.equals(directions, recipe.directions) && difficulty == recipe.difficulty && Arrays.equals(image, recipe.image);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(prepTime, cookTime, servings, source, url, directions, difficulty);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "prepTime=" + prepTime +
                ", cookTime=" + cookTime +
                ", servings=" + servings +
                ", source='" + source + '\'' +
                ", url='" + url + '\'' +
                ", directions='" + directions + '\'' +
                ", difficulty=" + difficulty +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
