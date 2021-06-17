package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Customer;
import com.MacbookStore.model.Product;
import com.MacbookStore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends ProductController{
    @Autowired
    private final CustomerService customerService;
    @Autowired
    private final ProductService productService;
    public UserController(){
        customerService = new CustomerService();
        productService = new ProductService();
    }

    private boolean checkCurrentUser(HttpSession session){
        if(session.getAttribute("user") != null){
            return true;
        }
        else{
            return false;
        }
    }

    public Product getNewProduct(Product product){
        product = getAllInfoProduct(product);
        return product;
    }

    @RequestMapping("/login")
    public String loginForm(Model model){
        model.addAttribute("customer", new CustomerViewModel());
        return "login";
    }

    @PostMapping("/login-submit")
    public String tryLogin(@Valid @ModelAttribute("customer") CustomerViewModel customer, BindingResult br, Model model, HttpSession session){
        if(br.hasErrors()){
            return "error";
        }
        if(customerService.checkAccount(customer)){
            session.setAttribute("user", customer.getUsername());
            session.setAttribute("customer", customerService.getCustomerByUsername(customer.getUsername()));
            String customerId = customerService.getCustomerId(customer.getUsername());
            session.setAttribute("customerId", customerId);
            model.addAttribute("currentUser", customer.getUsername());

            model.addAttribute("product", productService.getAllProduct());
            return "home";
        }
        else{
            String error = "username or password was wrong";
            model.addAttribute("error", error);
            return "login";
        }
    }
    @GetMapping("/logout")
    public String loginSuccess(HttpSession session, Model model){
        session.setAttribute("user", null);
        session.setAttribute("customer", null);
        session.setAttribute("customerId", null);
        session.setAttribute("cartSize", 0);
        model.addAttribute("product", productService.getAllProduct());
        return "home";
    }

    @RequestMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("customer", new CustomerViewModel());
        return "register";
    }
    @PostMapping("/register-submit")
    public String tryRegister(@Valid @ModelAttribute("customer") CustomerViewModel customer, BindingResult br) throws ParseException {
        if(br.hasErrors()){
            return "error";
        }
        customerService.insertCustomer(customer);
        return "login";
    }
    @RequestMapping("/manage/{id}")
    public String manage(@PathVariable("id") String id, Model model){
        Customer customer = customerService.getCustomerByUsername(id);
        CustomerViewModel cvm = new CustomerViewModel();
        cvm.setId(customer.getId());
        cvm.setCustomerName(customer.getCustomerName());
        cvm.setAddress(customer.getAddress());
        cvm.setBirth(customer.getBirth().toString());
        cvm.setEmail(customer.getEmail());
        cvm.setUsername(customer.getUsername());
        cvm.setPassword(customer.getPassword());
        cvm.setPhoneNumber(customer.getPhoneNumber());

        model.addAttribute("customer", cvm);
        return "manage";
    }
    @PostMapping("/editSubmit")
    public String editSubmit(@Valid @ModelAttribute("customer") CustomerViewModel customer, BindingResult br, Model model) throws ParseException {
        if(br.hasErrors()){
            return "error";
        }
        customerService.save(customer);
        model.addAttribute("customer", customer);
        return "manage";
    }

}
