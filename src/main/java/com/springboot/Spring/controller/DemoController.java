package com.springboot.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello World!");
        return "home/index";
    }
}
