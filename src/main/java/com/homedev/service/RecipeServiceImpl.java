package com.homedev.service;

import com.homedev.entity.Ingredient;
import com.homedev.entity.Recipe;
import com.homedev.repository.IngredientRepository;
import com.homedev.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe getById(long id) {
        return recipeRepository.findOne(id);
    }

    public Recipe add(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteById(long id) {
        recipeRepository.delete(id);
    }
}