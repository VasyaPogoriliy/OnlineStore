package com.github.vasyapogoriliy.onlinestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ProjectController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
