package com.MacbookStore.controller;

import com.MacbookStore.model.*;
import com.MacbookStore.service.*;
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
    @Autowired
    private final CpuService cpuService;
    @Autowired
    private final ColorService colorService;
    @Autowired
    private final DisplayService displayService;
    @Autowired
    private final DisplayCardService displayCardService;
    public AdminController() {
        productService = new ProductService();
        cpuService = new CpuService();
        colorService = new ColorService();
        displayService = new DisplayService();
        displayCardService = new DisplayCardService();
    }
    //1
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
    @GetMapping("/admin/color")
    public String colorForm(Model model){
        model.addAttribute("color",colorService.getAllColor());
        return "adminColor";
    }
    @GetMapping("/admin/display")
    public String displayForm(Model model){
        model.addAttribute("display",displayService.getAllDisplay());
        return "adminDisplay";
    }
    @GetMapping("/admin/displaycard")
    public String displayCardForm(Model model){
        model.addAttribute("displaycard",displayCardService.getAllDisplayCard());
        return "adminDisplayCard";
    }
    //2
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
    @GetMapping("/admin/color/{colorName}")
    public String colorListByCollectionID(@PathVariable("colorName") String colorName, Model model) {
        model.addAttribute("colorList");
        return "admin1Color";
    }
    @GetMapping("/admin/display/{displayName}")
    public String displayListByCollectionID(@PathVariable("displayName") String displayName, Model model) {
        model.addAttribute("displayList");
        return "admin1Display";
    }
    @GetMapping("/admin/displaycard/{displayCardName}")
    public String displayCardListByCollectionID(@PathVariable("displayCardName") String displayName, Model model) {
        model.addAttribute("displayCardList");
        return "admin1DisplayCard";
    }
    //3
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
    @GetMapping("/admin/insertColorForm")
    public String insertColorForm(Model model){
        model.addAttribute("color", new Color());
        return "adminInsertColor";
    }
    @GetMapping("/admin/insertDisplayForm")
    public String displayColorForm(Model model){
        model.addAttribute("display", new Display());
        return "adminInsertDisplay";
    }
    @GetMapping("/admin/insertDisplayCardForm")
    public String displayCardColorForm(Model model){
        model.addAttribute("displaycard", new DisplayCard());
        return "adminInsertDisplayCard";
    }
    //4
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
    @PostMapping("/admin/insertColorSubmit")
    public String insertColorSubmit(@Valid @ModelAttribute("color") Color color, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        colorService.insertColor(color);
        model.addAttribute("color", colorService.getAllColor());
        return "adminColor";
    }
    @PostMapping("/admin/insertDisplaySubmit")
    public String insertDisplaySubmit(@Valid @ModelAttribute("display") Display display, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        displayService.insertDisplay(display);
        model.addAttribute("display", displayService.getAllDisplay());
        return "adminDisplay";
    }
    @PostMapping("/admin/insertDisplayCardSubmit")
    public String insertDisplayCardSubmit(@Valid @ModelAttribute("displaycard") DisplayCard displaycard, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        displayCardService.insertDisplayCard(displaycard);
        model.addAttribute("displaycard", displayCardService.getAllDisplayCard());
        return "adminDisplayCard";
    }

}
