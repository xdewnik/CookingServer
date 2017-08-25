package com.homedev.service;

import com.homedev.entity.Ingredient;
import com.homedev.entity.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAll();
    Recipe getById(long id);
    Recipe add(Recipe recipe);
    void deleteById(long id);
}
