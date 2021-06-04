package com.MacbookStore.controller;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Cart;
import com.MacbookStore.model.Customer;
import com.MacbookStore.model.Order;
import com.MacbookStore.model.OrderDetail;
import com.MacbookStore.service.CartService;
import com.MacbookStore.service.OrderDetailService;
import com.MacbookStore.service.OrderService;
import org.mvel2.ast.Or;
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

    public int total(HttpSession session){
        int total = 0;
        List<Cart> cart = (List<Cart>)session.getAttribute("cart");
        for (Cart temp: cart
             ) {
            total+=temp.getPrice()*temp.getQuantity();
        }
        session.setAttribute("total", total);
        return total;
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
        if(!checkCurrentUser(session)){
            return "login";
        }
        List<Cart> cartList = cartService.findAllByCustomerId((String)session.getAttribute("customerId"));
        session.setAttribute("cart", cartList);
        return "cart";
    }

    @GetMapping("/add/{productId}")
    public String addToCart(@Valid @ModelAttribute("_id") String _id, BindingResult br, HttpSession session){
        if(!checkCurrentUser(session)){
            return "login";
        }
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
        model.addAttribute("customer", session.getAttribute("customer"));
        return "checkout";
    }

    @PostMapping("/confirmOrder")
    public String confirmOrder(@Valid @ModelAttribute("customer") Customer customer, BindingResult br, Model model, HttpSession session){
        if(!checkCurrentUser(session)){
            return "login";
        }
        //int orderId = orderService.getOrderId();
        int orderId = 2;
        Order order = new Order();
        List<Cart> cart = (List<Cart>)session.getAttribute("cart");

        order.setOrderId(orderId);
        order.setAddress(customer.getAddress());
        order.setCustomerId((String)session.getAttribute("customerId"));
        order.setStatus(0);
        order.setTotal(total(session));

        for (Cart temp: cart
             ) {
            OrderDetail tempOrder = new OrderDetail();
            tempOrder.setOrderId(orderId);
            tempOrder.setProductId(temp.getProductId());
            tempOrder.setProductName(temp.getProductName());
            tempOrder.setPrice(temp.getPrice());
            tempOrder.setQuantity(temp.getQuantity());
            orderDetailService.insert(tempOrder);
        }
        orderService.insert(order);

        cartService.deleteCartByUser((String)session.getAttribute("customerId"));
        return "successCheckout";
    }
}
