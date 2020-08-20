package com.codegym.controller;

import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
    ProductService productService = new ProductServiceImpl();

    @GetMapping("/product/{id}/view")
    public String view(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findId(id));
        return "/view";
    }
}
