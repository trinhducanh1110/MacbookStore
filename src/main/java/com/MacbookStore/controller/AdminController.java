package com.MacbookStore.controller;

import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private final ProductService productService;
    public AdminController() { productService = new ProductService(); }

    @GetMapping("/admin/home")
    public String homeForm(){
        return "adminHome";
    }

    @GetMapping("/admin/product")
    public String productForm(Model model){
        model.addAttribute("product",productService.getAllProduct());
        return "adminProduct";
    }

    @GetMapping("/admin/product/{productName}")
    public String productListByCollectionID(@PathVariable("productName") String productName, Model model) {
        model.addAttribute("productList");
        return "admin1Product";
    }


}
