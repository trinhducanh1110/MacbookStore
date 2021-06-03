package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.service.CustomerService;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private final CustomerService customerService;
    @Autowired
    private final ProductService productService;
    public UserController(){
        customerService = new CustomerService();
        productService = new ProductService();
    }


    @RequestMapping("/user/loginForm")
    public String loginForm(Model model){
        model.addAttribute("customer", new CustomerViewModel());
        return "login";
    }

    @PostMapping("/user/login-submit")
    public String tryLogin(@Valid @ModelAttribute("customer") CustomerViewModel customer, BindingResult br, Model model, HttpSession session){
        if(br.hasErrors()){
            return "error";
        }
        if(customerService.checkAccount(customer)){
            session.setAttribute("user", customer.getUsername());
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

    @GetMapping("/user/logout")
    public String loginSuccess(HttpSession session){
        session.setAttribute("user", null);
        return "home";
    }

}
