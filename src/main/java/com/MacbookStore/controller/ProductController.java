package com.MacbookStore.controller;
import com.MacbookStore.model.*;
import com.MacbookStore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {
    @Autowired
    private final ProductService productService;
    @Autowired
    private final ColorService colorService;
    @Autowired
    private final CpuService cpuService;
    @Autowired
    private final DisplayService displayService;
    @Autowired
    private final DisplayCardService displayCardService;
    @Autowired
    private final GroupService groupService;
    @Autowired
    private final HardDriveService hardDriveService;
    @Autowired
    private final RamService ramService;
    @Autowired
    private final YearService yearService;

    public ProductController() {
        productService = new ProductService();
        colorService = new ColorService();
        cpuService = new CpuService();
        displayCardService = new DisplayCardService();
        displayService = new DisplayService();
        groupService = new GroupService();
        hardDriveService = new HardDriveService();
        ramService = new RamService();
        yearService = new YearService();
    }

    public Product getAllInfoProduct(Product productt){
        Product product = productt;
        product.setColorID(colorService.getColorName(product.getColorID()));
        product.setCpuID(cpuService.get1Cpu(product.getCpuID()).getCpuName());
        product.setDisplayCardID(displayCardService.get1DisplayCard(product.getDisplayCardID()).getDisplayCardName());
        if(product.getDisplayCardID().equals("none")){
            product.setDisplayCardID(null);
        }
        product.setDisplayID(displayService.get1Display(product.getDisplayID()).getDisplayName());
        product.setGroupID(groupService.get1Group(product.getGroupID()).getGroupName());
        product.setHardDriveID(hardDriveService.get1HardDrive(product.getHardDriveID()).getHardDriveName());
        product.setRamID(ramService.get1Ram(product.getRamID()).getRamName());
        //product.setYearID(yearService.get1Year(product.getYearID()).getYearName());
        return product;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Product> product = productService.getAllProduct();
        List<Product> listProduct = new ArrayList<>();
        for(int i=0; i<6; i++){
            Product temp = product.get(i);
            temp = getAllInfoProduct(temp);
            listProduct.add(temp);
        }
        model.addAttribute("product", listProduct);
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        List<Product> product = productService.getAllProduct();
        List<Product> listProduct = new ArrayList<>();
        for(int i=0; i<6; i++){
            Product temp = product.get(i);
            temp = getAllInfoProduct(temp);
            listProduct.add(temp);
        }
        model.addAttribute("product", listProduct);
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String productListByCollectionID(@PathVariable("id") String id, Model model) {
        Product product = productService.get1Product((id));
        product = getAllInfoProduct(product);
        model.addAttribute("product", product);
        return "detail";
    }
    @GetMapping("/category/{status}/{groupId}/{year}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("status") String status,@Valid @PathVariable("groupId") String groupId, @Valid @PathVariable("year") String year, Model model){
        String title = " ";
        if(groupId.equals("MP")){
            title = status + " Macbook Pro " + year;
            groupId = "609bd04d8fbd1d3a9a03161a";
        }
        if(groupId.equals("MA")){
            title = status + " Macbook Air " + year;
            groupId = "609bd0428fbd1d3a9a031619";
        }
        if(year.equals("2019")){
            year = "609bd5e48fbd1d3a9a031633";
        }
        if(year.equals("2020")){
            year = "609bd5f18fbd1d3a9a031634";
        }
        if(year.equals("2018")){
            year = "609bd5de8fbd1d3a9a031632";
        }
        if(year.equals("2017")){
            year = "609bd5d78fbd1d3a9a031631";
        }
        if(year.equals("2016")){
            year = "609bd5d18fbd1d3a9a031630";
        }
        if(year.equals("2015")){
            year = "609bd5aa8fbd1d3a9a03162f";
        }
        List<Product> listProduct = productService.getMacBookProductByCategory(status,year,groupId);
        List<Product> newList = new ArrayList<>();
        for (Product item:listProduct
             ) {
            item = getAllInfoProduct(item);
            newList.add(item);
        }
        model.addAttribute("product", newList);

        model.addAttribute("title", title);
        return "macbookByCategory";
    }
    @GetMapping("/category/{groupId}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("groupId") String groupId, Model model){
        String title = "";
        if(groupId.equals("MK")){
            title = "Macgic KeyBoard";
            groupId = "609bd0648fbd1d3a9a03161b";
        }
        if(groupId.equals("MM")){
            title = "Macgic Mouse";
            groupId = "609bd0718fbd1d3a9a03161c";
        }
        if(groupId.equals("MT")){
            title = "Macgic Trackpad";
            groupId = "609bd0938fbd1d3a9a03161d";
        }
        if(groupId.equals("CAP")){
            title = "Charger";
            groupId = "609bd00caa23e78e339d9385";
        }
        if(groupId.equals("TUI")){
            title = "Shockproof Bag";
            groupId = "609bd0da8fbd1d3a9a03161e";
        }
        List<Product> listProduct = productService.getAccessoriesByCategory(groupId);
        List<Product> newList = new ArrayList<>();
        for (Product item:listProduct
             ) {
            item.setColorID(colorService.getColorName(item.getColorID()));
            newList.add(item);
        }
        model.addAttribute("product", newList);
        model.addAttribute("title", title);
        return "accessoriesByCategory";
    }

}
