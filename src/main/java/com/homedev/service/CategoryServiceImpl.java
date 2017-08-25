package com.homedev.service;

import com.homedev.entity.Category;
import com.homedev.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(long id) {
        return categoryRepository.findOne(id);
    }

    public Category add(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteById(long id) {
        categoryRepository.delete(id);
    }
}