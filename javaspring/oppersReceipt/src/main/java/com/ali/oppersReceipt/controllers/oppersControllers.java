package com.ali.oppersReceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class oppersControllers {
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Hsouna Ali";
        String itemName = "Gold";
        double price = 55.25;
        String description = "barcha floussss";
        String vendor = "bijoutourie";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        return "index.jsp";
    }
}
