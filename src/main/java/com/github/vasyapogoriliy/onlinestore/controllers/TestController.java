package com.github.vasyapogoriliy.onlinestore.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TestController {


    @GetMapping("/home")
    public String test() {
        return "index";
    }

}
