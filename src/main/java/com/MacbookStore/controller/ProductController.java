package com.MacbookStore.controller;
import com.MacbookStore.model.Product;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    public ProductController() { productService = new ProductService(); }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("product",productService.getAllProduct());
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String productListByCollectionID(@PathVariable("id") String id, Model model) {
        model.addAttribute("product", productService.get1Product(id));
        return "detail";
    }
}
