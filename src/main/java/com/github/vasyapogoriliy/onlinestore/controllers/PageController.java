package com.github.vasyapogoriliy.onlinestore.controllers;


import com.github.vasyapogoriliy.onlinestore.dao.CategoryDAO;
import com.github.vasyapogoriliy.onlinestore.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

    private final CategoryDAO categoryDAO;

    @Autowired
    public PageController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    //@RequestMapping("/home")
    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("userClickHome", true);
        model.addAttribute("categories", CategoryDAO.getCategoriesList());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        model.addAttribute("userClickAbout", true);
        return "index";
    }


    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        model.addAttribute("userClickContact", true);
        return "index";
    }

    @GetMapping("/show/all/products")
    public String showAllProducts(Model model) {
        model.addAttribute("title", "All devices");
        model.addAttribute("categories", CategoryDAO.getCategoriesList());
        model.addAttribute("userClickAllProducts", true);
        return "index";
    }

    @GetMapping("/show/category/{id}/products")
    public String showCategoryProducts(Model model, @PathVariable("id") int id) {
        Category category = categoryDAO.getCategory(id);
        model.addAttribute("title", category.getName());
        model.addAttribute("category", category);
        model.addAttribute("categories", CategoryDAO.getCategoriesList());
        model.addAttribute("userClickCategoryProducts", true);
        return "index";
    }


}
