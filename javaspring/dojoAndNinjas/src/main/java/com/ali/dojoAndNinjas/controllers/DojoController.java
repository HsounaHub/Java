package com.ali.dojoAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ali.dojoAndNinjas.models.Dojo;
import com.ali.dojoAndNinjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	
	// Show All Dojos
		@GetMapping("/dojos")
		public String showAll(Model model) {
			List<Dojo> allDojos = dojoService.allDojos();
			
			model.addAttribute("allDojos", allDojos);
			return "dojos.jsp";
		}
		
		// Show Dojo Form
		@GetMapping("/dojos/new")
		public String dojoForm(@ModelAttribute("dojo") Dojo dojo) {
			return "createdojo.jsp";
		}
		
		// Create One Dojo
		@PostMapping("dojos/new")
		public String createOneDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
			if (result.hasErrors()) {
				return "dojoForm.jsp";
			} else 
				dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
		@GetMapping("dojos/{id}")
		public String showOneDojo(@PathVariable("id") Long id, Model model) {
			Dojo oneDojo = dojoService.findDojo(id);
			model.addAttribute("oneDojo",oneDojo);
			return "onedojo.jsp";
		}
}
