package com.homedev.service;

import com.homedev.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();
    Category getById(long id);
    Category add(Category category);
    void deleteById(long id);

}
