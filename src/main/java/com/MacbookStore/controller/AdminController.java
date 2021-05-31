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
    @Autowired
    private final GroupService groupService;
    @Autowired
    private final HardDriveService hardDriveService;
    @Autowired
    private final RamService ramService;
    @Autowired
    private final YearService yearService;
    public AdminController() {
        productService = new ProductService();
        cpuService = new CpuService();
        colorService = new ColorService();
        displayService = new DisplayService();
        displayCardService = new DisplayCardService();
        groupService = new GroupService();
        hardDriveService = new HardDriveService();
        ramService = new RamService();
        yearService = new YearService();
    }
    //1
    @GetMapping("/admin/home")
    public String homeForm(){
        return "adminHome";
    }

// -------------------------------------------------- list view all --------------------------------------------------

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
    @GetMapping("/admin/group")
    public String groupForm(Model model){
        model.addAttribute("group",groupService.getAllGroup());
        return "adminGroup";
    }
    @GetMapping("/admin/harddrive")
    public String hardDriveForm(Model model){
        model.addAttribute("harddrive",hardDriveService.getAllHardDrive());
        return "adminHardDrive";
    }
    @GetMapping("/admin/ram")
    public String ramForm(Model model){
        model.addAttribute("ram",ramService.getAllRam());
        return "adminRam";
    }
    @GetMapping("/admin/year")
    public String yearForm(Model model){
        model.addAttribute("year",yearService.getAllYear());
        return "adminYear";
    }

// -------------------------------------------------- list view by .. --------------------------------------------------

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
    @GetMapping("/admin/group/{groupName}")
    public String groupListByCollectionID(@PathVariable("groupName") String groupName, Model model) {
        model.addAttribute("groupList");
        return "admin1Group";
    }
    @GetMapping("/admin/harddrive/{hardDriveName}")
    public String hardDriveListByCollectionID(@PathVariable("hardDriveName") String hardDriveName, Model model) {
        model.addAttribute("hardDriveList");
        return "admin1HardDrive";
    }
    @GetMapping("/admin/ram/{ramName}")
    public String ramListByCollectionID(@PathVariable("ramName") String ramName, Model model) {
        model.addAttribute("ramList");
        return "admin1Ram";
    }
    @GetMapping("/admin/year/{yearName}")
    public String yearListByCollectionID(@PathVariable("yearName") String yearName, Model model) {
        model.addAttribute("yearList");
        return "admin1Year";
    }

// -------------------------------------------------- insert form --------------------------------------------------

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
    public String insertDisplayColorForm(Model model){
        model.addAttribute("display", new Display());
        return "adminInsertDisplay";
    }
    @GetMapping("/admin/insertDisplayCardForm")
    public String insertDisplayCardColorForm(Model model){
        model.addAttribute("displaycard", new DisplayCard());
        return "adminInsertDisplayCard";
    }
    @GetMapping("/admin/insertGroupForm")
    public String insertGroupForm(Model model){
        model.addAttribute("group", new Group());
        return "adminInsertGroup";
    }
    @GetMapping("/admin/insertHardDriveForm")
    public String insertHardDriveForm(Model model){
        model.addAttribute("harddrive", new HardDrive());
        return "adminInsertHardDrive";
    }
    @GetMapping("/admin/insertRamForm")
    public String insertRamForm(Model model){
        model.addAttribute("ram", new RAM());
        return "adminInsertRam";
    }
    @GetMapping("/admin/insertYearForm")
    public String insertYearForm(Model model){
        model.addAttribute("year", new Year());
        return "adminInsertYear";
    }

// -------------------------------------------------- insert submit --------------------------------------------------

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
    @PostMapping("/admin/insertGroupSubmit")
    public String insertGroupSubmit(@Valid @ModelAttribute("group") Group group, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        groupService.insertGroup(group);
        model.addAttribute("group", groupService.getAllGroup());
        return "adminGroup";
    }
    @PostMapping("/admin/insertHardDriveSubmit")
    public String insertHardDriveSubmit(@Valid @ModelAttribute("harddrive") HardDrive hardDrive, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        hardDriveService.insertHardDrive(hardDrive);
        model.addAttribute("harddrive", hardDriveService.getAllHardDrive());
        return "adminHardDrive";
    }
    @PostMapping("/admin/insertRamSubmit")
    public String insertRamSubmit(@Valid @ModelAttribute("ram") RAM ram, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        ramService.insertRam(ram);
        model.addAttribute("ram", ramService.getAllRam());
        return "adminRam";
    }
    @PostMapping("/admin/insertYearSubmit")
    public String insertYearSubmit(@Valid @ModelAttribute("year") Year year, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        yearService.insertYear(year);
        model.addAttribute("year", yearService.getAllYear());
        return "adminYear";
    }

// -------------------------------------------------- return update view --------------------------------------------------

    @GetMapping("/admin/product/edit/{productId}")
    public String editProduct(@Valid @ModelAttribute("productId") String productId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        model.addAttribute("product", productService.get1Product(productId));
        return "adminEditProduct";
    }
    @GetMapping("/admin/cpu/edit/{cpuId}")
    public String editCpu(@Valid @ModelAttribute("cpuId") String cpuId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        model.addAttribute("cpu", cpuService.get1Cpu(cpuId));
        return "adminEditCpu";
    }
    @GetMapping("/admin/color/edit/{colorId}")
    public String editColor(@Valid @ModelAttribute("colorId") String colorId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        model.addAttribute("color", colorService.get1Color(colorId));
        return "adminEditColor";
    }
    @GetMapping("/admin/display/edit/{displayId}")
    public String editDisplay(@Valid @ModelAttribute("displayId") String displayId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        model.addAttribute("display", displayService.get1Display(displayId));
        return "adminEditDisplay";
    }

// -------------------------------------------------- update submit --------------------------------------------------

    @PostMapping("/admin/editProductSubmit")
    public String editProductSubmit(@Valid @ModelAttribute("product") Product product, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        productService.updateProduct(product);
        model.addAttribute("product", productService.getAllProduct());
        return "adminProduct";
    }
    @PostMapping("/admin/editCpuSubmit")
    public String editCpuSubmit(@Valid @ModelAttribute("cpu") CPU cpu, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        cpuService.updateCpu(cpu);
        model.addAttribute("cpu", cpuService.getAllCpu());
        return "adminCpu";
    }
    @PostMapping("/admin/editColorSubmit")
    public String editColorSubmit(@Valid @ModelAttribute("color") Color color, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        colorService.updateColor(color);
        model.addAttribute("color", colorService.getAllColor());
        return "adminColor";
    }
    @PostMapping("/admin/editDisplaySubmit")
    public String editDisplaySubmit(@Valid @ModelAttribute("display") Display display, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        displayService.updateDisplay(display);
        model.addAttribute("display", displayService.getAllDisplay());
        return "adminDisplay";
    }

// -------------------------------------------------- delete --------------------------------------------------

    @GetMapping("/admin/product/delete/{productId}")
    public String deleteProduct(@Valid @ModelAttribute("productId") String productId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        productService.deleteProduct(productId);
        model.addAttribute("product", productService.getAllProduct());
        return "adminProduct";
    }
    @GetMapping("/admin/cpu/delete/{cpuId}")
    public String deleteCpu(@Valid @ModelAttribute("cpuId") String cpuId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        cpuService.deleteCpu(cpuId);
        model.addAttribute("cpu", cpuService.getAllCpu());
        return "adminCpu";
    }
    @GetMapping("/admin/color/delete/{colorId}")
    public String deleteColor(@Valid @ModelAttribute("colorId") String colorId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        colorService.deleteColor(colorId);
        model.addAttribute("color", colorService.getAllColor());
        return "adminColor";
    }
    @GetMapping("/admin/display/delete/{displayId}")
    public String deleteDisplay(@Valid @ModelAttribute("displayId") String displayId, BindingResult br, Model model)
    {
        if(br.hasErrors()){
            return "error";
        }
        displayService.deleteDisplay(displayId);
        model.addAttribute("display", displayService.getAllDisplay());
        return "adminDisplay";
    }

}
