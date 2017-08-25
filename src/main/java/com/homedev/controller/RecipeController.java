package com.homedev.controller;

import com.homedev.entity.Recipe;
import com.homedev.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeService recipeService;


    /**
     Поиск
     */
    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    @ResponseBody
    public List<Recipe> getAllRecipes(){ ;
        return recipeService.getAll();
    }


    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Recipe getRecipeById(@PathVariable("id") long recipeId){
        return recipeService.getById(recipeId);
    }

    /**
     Добавление
     */

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    @ResponseBody
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.add(recipe);
    }

    /**
     Обновление
     */

    @RequestMapping(value = "/recipes", method = RequestMethod.POST)
    @ResponseBody
    public Recipe updateGroup(@RequestBody Recipe recipe){
        return recipeService.add(recipe);
    }

    /**
     Удаление
     */

    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteGroup(@PathVariable("id") long recipeId){
        recipeService.deleteById(recipeId);
    }


}
