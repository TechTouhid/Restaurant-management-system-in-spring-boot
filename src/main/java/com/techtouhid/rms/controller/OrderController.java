package com.techtouhid.rms.controller;

import com.techtouhid.rms.model.Order;
import com.techtouhid.rms.model.Product;
import com.techtouhid.rms.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class OrderController {
    //    private String list_redirect="redirect:/product/list";
    @Autowired
    private com.techtouhid.rms.service.ProductService productService;

    @Autowired
    private com.techtouhid.rms.service.OrderService orderService;

    @Autowired
    private com.techtouhid.rms.service.ProductTypeService productTypeService;

    @GetMapping("/order")
    public String listProduct(Model model) {
        List<ProductType> productTypes = productTypeService.listAll();
        model.addAttribute("productTypes", productTypes);

        List<Product> listProducts = productService.listAll();
        model.addAttribute("listProducts", listProducts);

        return "order";
    }


    @GetMapping("/order/{id}")
    public String makeOrder(@PathVariable("id") int id, Model model, Order order) {
//        List<Product> listProducts = productService.listAll();
        Product product = productService.get(id);
        model.addAttribute("product", product);

        order.setProductName(product.getName());
        order.setProductId(product.getId());
        order.setPrice(product.getPrice());
        order.setMadein(product.getMadein());

        model.addAttribute("order", order);

        return "add_edit_order";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") Order order, BindingResult result, Model model) {
//        Product product = productService.getProductById(id);
//        model.addAttribute("orderProduct", product.getName());
//        model.addAttribute("order", order);
//        List<Product> listProducts = productService.listAll();
//        model.addAttribute("orderProduct", listProducts);

        orderService.saveOrder(order);
        return "order";
    }
}
