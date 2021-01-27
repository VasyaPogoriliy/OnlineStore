package com.github.vasyapogoriliy.onlinestore.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    //@GetMapping("/home")
    @RequestMapping("/home")
    public String index(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("userClickHome", true);
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        model.addAttribute("userClickAbout", true);
        return "index";
    }

    @RequestMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Services");
        model.addAttribute("userClickServices", true);
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        model.addAttribute("userClickContact", true);
        return "index";
    }

}
