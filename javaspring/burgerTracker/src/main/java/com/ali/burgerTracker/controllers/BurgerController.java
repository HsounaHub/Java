package com.ali.burgerTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ali.burgerTracker.models.Burger;
import com.ali.burgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	private BurgerService burgerServ;
	
	@GetMapping("/")
	public String home(@ModelAttribute("burger") Burger burger, Model m) {
		List<Burger> allTheBurgers = burgerServ.allBurgers();
		m.addAttribute("burgersList", allTheBurgers);
		return "index.jsp";
	}
	@PostMapping("/burger/new")
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result,
							Model m) {
		
		if (result.hasErrors()) {
			List<Burger> allTheBurgers = burgerServ.allBurgers();
			m.addAttribute("burgersList", allTheBurgers);
			return "index.jsp";
		} else {
			// save the burger
		 burgerServ.createBurger(burger);

		return "redirect:/";
		}
		
	}
	@GetMapping("burger/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		// find that burger with provided id
		Burger thisBurger = burgerServ.findBurger(id);
		
		// pass thisBurger to the jsp page 
		model.addAttribute("burger",thisBurger);
		
		return "editburger.jsp";
	}
	@PutMapping("/burger/{id}/edit")
	public String updateBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if (result.hasErrors()) {
			return "editburger.jsp";
		} else {
			// if there are no errors update burger
			burgerServ.updateBurger(burger);
			return "redirect:/";
		}
	}
}
