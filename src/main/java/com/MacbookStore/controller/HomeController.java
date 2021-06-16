package com.MacbookStore.controller;

import com.MacbookStore.model.Product;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private final ProductService productService;

    public HomeController(){
        productService = new ProductService();
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        List<Product> product = productService.getAllProduct();
        List<Product> listProduct = new ArrayList<>();
        for(int i=0; i<6; i++){
            Product temp = product.get(i);
            listProduct.add(temp);
        }
        model.addAttribute("product", listProduct);
        return "home";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage() {
        return "contact";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage() {
        return "about";
    }

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String servicePage() {
        return "service";
    }

    @RequestMapping(value = "/newest", method = RequestMethod.GET)
    public String newestPage() {
        return "newest";
    }

}