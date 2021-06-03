package com.MacbookStore.controller;
import com.MacbookStore.model.Product;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    public ProductController() { productService = new ProductService(); }

    @GetMapping("/")
    public String home(Model model) {
        //model.addAttribute("product",productService.getAllProduct());
        model.addAttribute("product", productService.getMacBookProductByCategory("Old", "2015"));
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String productListByCollectionID(@PathVariable("id") String id, Model model) {
        model.addAttribute("product", productService.get1Product(id));
        return "detail";
    }
    @GetMapping("/category/{status}/{year}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("status") String status, @Valid @PathVariable("year") String year, Model model){
        model.addAttribute("product", productService.getMacBookProductByCategory(status, year));
        model.addAttribute("title", status);
        model.addAttribute("year", year);
        return "macbookByCategory";
    }
    @GetMapping("/cate/{status}")
    public String macbookOldByStatusAndYear(@Valid @PathVariable("status") String status, Model model){
        model.addAttribute("product", productService.getMacBookProductByStatus(status));
        model.addAttribute("title", status);
        return "macbookByCategory";
    }
}
