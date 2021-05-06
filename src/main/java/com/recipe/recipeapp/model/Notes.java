package com.recipe.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String notes;

    public Notes() {
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes1 = (Notes) o;
        return Objects.equals(notes, notes1.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        return "Notes{" +
                "notes='" + notes + '\'' +
                '}';
    }
}
