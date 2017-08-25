package com.homedev.service;

import com.homedev.entity.Category;
import com.homedev.entity.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getAll();
    Ingredient getById(long id);
    Ingredient add(Ingredient ingr);
    void deleteById(long id);

}
