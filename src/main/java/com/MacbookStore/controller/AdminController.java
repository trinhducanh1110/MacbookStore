package com.MacbookStore.controller;

import com.MacbookStore.model.CPU;
import com.MacbookStore.model.Product;
import com.MacbookStore.service.CpuService;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    private final ProductService productService;
    private final CpuService cpuService;
    public AdminController() {
        productService = new ProductService();
        cpuService = new CpuService();
    }

    @GetMapping("/admin/home")
    public String homeForm(){
        return "adminHome";
    }

    @GetMapping("/admin/product")
    public String productForm(Model model){
        model.addAttribute("product",productService.getAllProduct());
        return "adminProduct";
    }
    @GetMapping("/admin/cpu")
    public String cpuForm(Model model){
        model.addAttribute("cpu",cpuService.getAllCpu());
        return "adminCpu";
    }

    @GetMapping("/admin/product/{productName}")
    public String productListByCollectionID(@PathVariable("productName") String productName, Model model) {
        model.addAttribute("productList");
        return "admin1Product";
    }
    @GetMapping("/admin/cpu/{cpuName}")
    public String cpuListByCollectionID(@PathVariable("cpuName") String cpuName, Model model) {
        model.addAttribute("cpuList");
        return "admin1Cpu";
    }

    @GetMapping("/admin/insertProductForm")
    public String insertProductForm(Model model){
        model.addAttribute("product", new Product());
        return "adminInsertProduct";
    }
    @GetMapping("/admin/insertCpuForm")
    public String insertCpuForm(Model model){
        model.addAttribute("cpu", new CPU());
        return "adminInsertCpu";
    }

    @PostMapping("/admin/insertProductSubmit")
    public String insertProductSubmit(@Valid @ModelAttribute("product") Product product, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        productService.insertProduct(product);
        model.addAttribute("product", productService.getAllProduct());
        return "adminProduct";
    }
    @PostMapping("/admin/insertCpuSubmit")
    public String insertCpuSubmit(@Valid @ModelAttribute("cpu") CPU cpu, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        cpuService.insertCpu(cpu);
        model.addAttribute("cpu", cpuService.getAllCpu());
        return "adminCpu";
    }

}
