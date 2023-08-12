package com.ali.saveTravel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ali.saveTravel.models.Travel;
import com.ali.saveTravel.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	@Autowired
	private TravelService travelServ;
	
	@GetMapping("/")
	public String home(@ModelAttribute("travel") Travel travel, Model m) {
		List<Travel> allTheTravels = travelServ.allTravels();
		m.addAttribute("travelsList", allTheTravels);
		return "index.jsp";
	}
	@PostMapping("/travel/new")
	public String createTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result,
							Model m) {
		
		if (result.hasErrors()) {
			List<Travel> allTheTravels = travelServ.allTravels();
			m.addAttribute("travelsList", allTheTravels);
			return "index.jsp";
		} else {
			// save the travel
		 travelServ.createTravel(travel);

		return "redirect:/";
		}
		
	}
	@GetMapping("travel/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		// find that travel with provided id
		Travel thisTravel = travelServ.findTravel(id);
		
		// pass thisTravel to the jsp page 
		model.addAttribute("travel",thisTravel);
		
		return "edittravel.jsp";
	}
	@PutMapping("/travel/{id}/edit")
	public String updateTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "edittravel.jsp";
		} else {
			// if there are no errors update travel
			travelServ.updateTravel(travel);
			return "redirect:/";
		}
	}
	@DeleteMapping("/travel/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelServ.deleteTravel(id);
		return "redirect:/";
	}
	@GetMapping("/travel/{id}")
	public String showOne(@PathVariable("id") Long id,
					Model model) {
		
		// fetch the book from DB
		Travel thisTravel = travelServ.findTravel(id);
		
		// pass the book the jsp page
		model.addAttribute("travel",thisTravel);
		
		return "showtravel.jsp";
	}
}
