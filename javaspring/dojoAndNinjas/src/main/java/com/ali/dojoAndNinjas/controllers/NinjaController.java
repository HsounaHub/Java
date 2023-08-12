package com.ali.dojoAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ali.dojoAndNinjas.models.Dojo;
import com.ali.dojoAndNinjas.models.Ninja;
import com.ali.dojoAndNinjas.services.DojoService;
import com.ali.dojoAndNinjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjaServ;
	@Autowired
	private DojoService dojoServ;
	
	@GetMapping("/ninja/new")
	public String home(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List <Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("dojoList",allDojos);
		return "createninja.jsp";
	}
	@PostMapping("/ninja/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		
		if (result.hasErrors()) {

			return "createninja.jsp";
		} else {
			// save the ninja
		 ninjaServ.createNinja(ninja);

		return "redirect:/dojos";
		}
		
	}
	
}
