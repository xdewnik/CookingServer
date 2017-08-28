package com.homedev.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long idRecipe;

    @Column(name = "recipeName", nullable = false)
    private String nameRecipe;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    @Column(name ="description", length = 600)
    private String descriptionRecipe;

    @Column(name = "tutorial", length = 10000)
    private String tutorialRecipe;

    @Column(name = "photo")
    private byte[] image;

    @JsonIgnore
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ingredient> ingridientRecipe;


    public Recipe(){

    }


    public long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(long idRecipe) {
        this.idRecipe = idRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescriptionRecipe() {
        return descriptionRecipe;
    }

    public void setDescriptionRecipe(String descriptionRecipe) {
        this.descriptionRecipe = descriptionRecipe;
    }

    public String getTutorialRecipe() {
        return tutorialRecipe;
    }

    public void setTutorialRecipe(String tutorialRecipe) {
        this.tutorialRecipe = tutorialRecipe;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Ingredient> getIngridientRecipe() {
        return ingridientRecipe;
    }

    public void setIngridientRecipe(List<Ingredient> ingridientRecipe) {
        this.ingridientRecipe = ingridientRecipe;
    }
}
