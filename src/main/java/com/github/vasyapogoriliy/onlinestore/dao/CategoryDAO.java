package com.github.vasyapogoriliy.onlinestore.dao;

import com.github.vasyapogoriliy.onlinestore.models.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDAO {

    private static final List<Category> categoryList = new ArrayList<>();

    static {
        Category category1 = new Category(1, "TVs", "This is TV description", "some URL", true);
        Category category2 = new Category(2, "Smartphones", "This is smartphones description", "some URL", true);
        Category category3 = new Category(3, "Computers", "This is computers description", "some URL", true);
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
    }

    public static List<Category> getCategoriesList() {
        return categoryList;
    }

    public Category getCategory(int id) {
        for (Category category : categoryList) {
            if (category.getId() == id) return category;
        }
        return null;
    }

}
