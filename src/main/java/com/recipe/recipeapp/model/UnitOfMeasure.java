package com.recipe.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String uom;

    public UnitOfMeasure() {
    }

    public UnitOfMeasure(String uom) {
        this.uom = uom;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitOfMeasure that = (UnitOfMeasure) o;
        return Objects.equals(uom, that.uom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uom);
    }

        @Override
        public String toString () {
            return "UnitOfMeasure{" +
                    "uom='" + uom + '\'' +
                    '}';
        }
}