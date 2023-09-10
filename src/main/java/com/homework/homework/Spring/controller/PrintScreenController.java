package com.homework.homework.Spring.controller;

import com.homework.homework.Spring.model.Furniture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrintScreenController {

    Furniture furniture = new Furniture("Bed", 250.0, 200.0, 85.0, 2500, 10);


    @GetMapping("/")
    public String showMainPage() {
        return "mainPage";
    }

    @GetMapping("/show")
    public String show(Model model) {

        model.addAttribute("furniture", furniture);


        return "printScreen";
    }

    @GetMapping("/show/warehouse")
    public String showWarehouse(Model model) {

        model.addAttribute("furniture", furniture);

        return "warehouse";
    }
}
