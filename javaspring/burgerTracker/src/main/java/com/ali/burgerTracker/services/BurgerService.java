package com.ali.burgerTracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.burgerTracker.models.Burger;
import com.ali.burgerTracker.repositories.BurgerRepo;

@Service
public class BurgerService {
	@Autowired
	private BurgerRepo burgerRepo;
	
	// READ ALL
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	// CREATE
	public Burger createBurger(Burger b) {
		return burgerRepo.save(b);
	}
	
	// READ ONE
	public Burger findBurger(Long id) {
		
		Optional<Burger> maybeBurger = burgerRepo.findById(id);
		if(maybeBurger.isPresent()) {
			return maybeBurger.get();
		}else {
			return null;
		}
	}
	
	// UPDATE 
	public Burger updateBurger(Burger b) {
		return burgerRepo.save(b);
	}
	
	// DELETE
	public void deleteBurger(Long id) {
		burgerRepo.deleteById(id);
	}
}
