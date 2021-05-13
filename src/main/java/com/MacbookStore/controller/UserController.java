package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.CustomerQuery;
import com.MacbookStore.service.CustomerService;
import com.MacbookStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private final CustomerService customerService;
    public UserController(){
        customerService = new CustomerService();
    }
    @RequestMapping("/user/loginForm")
    public String loginForm(Model model){
        model.addAttribute("customer", new CustomerViewModel());
        return "login";
    }

    @PostMapping("/user/login-submit")
    public String tryLogin(@Valid @ModelAttribute("registerViewModel") CustomerViewModel customer, BindingResult br, Model model){
        if(br.hasErrors()){
            return "error";
        }
        if(customerService.checkAccount(customer)){
            model.addAttribute("currentUser", customer);
            return "home";
        }
        String error = "username or password was wrong";
        model.addAttribute("error", error);
        return "login";
    }

}
