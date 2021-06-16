package com.MacbookStore.controller;

import com.MacbookStore.model.Product;
import com.MacbookStore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;


@Controller
public class ProductController {

    @Autowired
    private final ProductService productService;
    @Autowired
    private final YearService yearService;
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

    public ProductController() {
        productService = new ProductService();
        yearService = new YearService();
        colorService = new ColorService();
        cpuService = new CpuService();
        displayService = new DisplayService();
        displayCardService = new DisplayCardService();
        groupService = new GroupService();
        hardDriveService = new HardDriveService();
        ramService = new RamService();
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("product",productService.getAllProduct());
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String productListByCollectionID(@PathVariable("id") String id, Model model) {
        Product product = productService.get1Product(id);
        product.setYearID(yearService.getYearName(product.getYearID()));
        product.setColorID(colorService.getColorName(product.getColorID()));
        product.setCpuID(cpuService.getCpuName(product.getYearID()));
        product.setDisplayID(displayService.getDisplayName(product.getYearID()));
        product.setDisplayCardID(displayCardService.getDisplayCardId(product.getYearID()));
        product.setGroupID(groupService.getGroupName(product.getYearID()));
        product.setHardDriveID(hardDriveService.get1HardDrive(product.getYearID()).getHardDriveName());
        product.setRamID(ramService.get1Ram(product.getYearID()).getRamName());
        model.addAttribute("product", product);
        return "detail";
    }
    @GetMapping("/category/{status}/{groupId}/{year}")
    public String macbookNewByStatusAndYear(@Valid @PathVariable("status") String status,@Valid @PathVariable("groupId") String groupId, @Valid @PathVariable("year") String year, Model model){
        model.addAttribute("product", productService.getMacBookProductByCategory(status, year, groupId));
        String title = " ";
        if(groupId.equals("MP")){
            title = status + " Macbook Pro " + year;
        }
        if(groupId.equals("MA")){
            title = status + " Macbook Air " + year;
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
