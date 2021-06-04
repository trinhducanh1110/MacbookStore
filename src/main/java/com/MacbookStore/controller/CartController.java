package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Cart;
import com.MacbookStore.service.CartService;
import com.MacbookStore.service.OrderDetailService;
import com.MacbookStore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController{

    @Autowired
    private final CartService cartService;
    @Autowired
    private final OrderService orderService;
    @Autowired
    private final OrderDetailService orderDetailService;

    public CartController(){
        cartService = new CartService();
        orderService = new OrderService();
        orderDetailService = new OrderDetailService();
    }

    private boolean checkCurrentUser(HttpSession session){
        if(session.getAttribute("user") != null){
            return true;
        }
        else{
            return false;
        }
    }

    @RequestMapping("/")
    public String cartForm(HttpSession session){
        List<Cart> cartList = cartService.findAllByCustomerId((String)session.getAttribute("customerId"));
        session.setAttribute("cart", cartList);
        return "cart";
    }

    @GetMapping("/delete/{_id}")
    public String deleteItemFromCart(@Valid @ModelAttribute("_id") String _id, BindingResult br, HttpSession session){
        cartService.deleteItemFromCart(_id);
        if(br.hasErrors()){
            return "error";
        }
        List<Cart> cartList = cartService.findAllByCustomerId((String)session.getAttribute("customerId"));
        session.setAttribute("cart", cartList);
        return "cart";
    }

    @RequestMapping("/checkout")
    public String checkOut(Model model, HttpSession session){
        if(!checkCurrentUser(session)){
            return "login";
        }
        return "checkOut";
    }
}
