package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UpdateController {
    ProductService productService = new ProductServiceImpl();

    @GetMapping("/product/{id}/edit")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.findId(id));
        return "/edit";
    }

    @PostMapping("/product/update")
    public String edit(Product product, RedirectAttributes redirect) {
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }
}
