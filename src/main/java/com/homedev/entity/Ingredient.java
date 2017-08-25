package com.homedev.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long idIngredient;

    @Column(name = "ingredientName", nullable = false)
    private String ingredientName;

    @ManyToOne
    @JoinColumn(name = "ingridientRecipe", nullable = false)
    private Recipe recipe;


    public Ingredient(){

    }

    public long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
