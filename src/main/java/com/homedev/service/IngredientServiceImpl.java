package com.homedev.service;

import com.homedev.entity.Category;
import com.homedev.entity.Ingredient;
import com.homedev.repository.CategoryRepository;
import com.homedev.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    public Ingredient getById(long id) {
        return ingredientRepository.findOne(id);
    }

    public Ingredient add(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public void deleteById(long id) {
        ingredientRepository.delete(id);
    }
}