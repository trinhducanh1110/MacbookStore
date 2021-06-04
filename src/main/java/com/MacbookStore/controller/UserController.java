package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Customer;
import com.MacbookStore.service.CustomerService;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;
import java.text.ParseException;

@Controller
@RequestMapping("/user")
public class UserController {
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
            model.addAttribute("product",productService.getAllProduct());
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
        model.addAttribute("product",productService.getAllProduct());
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

}
