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
        model.addAttribute("product",productService.getAllProduct());
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String productListByCollectionID(@PathVariable("id") String id, Model model) {
        model.addAttribute("product", productService.get1Product(id));
        return "detail";
    }
    @GetMapping("/category/{status}/{groupId}/{year}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("status") String status,@Valid @PathVariable("groupId") String groupId, @Valid @PathVariable("year") String year, Model model){
        model.addAttribute("product", productService.getMacBookProductByCategory(status, year, groupId));
        String title = "";
        if(groupId == "MP"){
            title = status+" Macbook "+groupId+" "+year;
        }
        if(groupId == "MA"){
            title = status+" Macbook "+groupId+" "+year;
        }

        model.addAttribute("title", title);
        return "macbookByCategory";
    }
    @GetMapping("/category/{groupId}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("groupId") String groupId, Model model){
        model.addAttribute("product", productService.getAccessoriesByCategory(groupId));
        String title = "";
        if(groupId == "MK"){
            title = "Macgic KeyBoard";
        }
        if(groupId == "MM"){
            title = "Macgic Mouse";
        }
        if(groupId == "TP"){
            title = "Macgic Trackpad";
        }
        if(groupId == "CAP"){
            title = "Charger";
        }
        if(groupId == "TUI"){
            title = "Shockproof Bag";
        }
        model.addAttribute("title", title);
        return "accessoriesByCategory";
    }

}
