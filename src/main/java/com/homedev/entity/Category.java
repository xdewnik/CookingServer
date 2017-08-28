package com.homedev.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categ")
public class Category {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long idCategory;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Recipe> recipeListCategory;

    @Column(name = "nameCategory")
    private String nameCategory;

    public Category(){
    }


    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public List<Recipe> getRecipeListCategory() {
        return recipeListCategory;
    }

    public void setRecipeListCategory(List<Recipe> recipeListCategory) {
        this.recipeListCategory = recipeListCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
