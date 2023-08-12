package com.ali.dojoAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.dojoAndNinjas.models.Ninja;
import com.ali.dojoAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	// === CRUD ===
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
	// READ ALL
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	// CREATE
	public Ninja createNinja(Ninja b) {
		return ninjaRepo.save(b);
	}
	
	// READ ONE
	public Ninja findNinja(Long id) {
		
		Optional<Ninja> maybeNinja = ninjaRepo.findById(id);
		if(maybeNinja.isPresent()) {
			return maybeNinja.get();
		}else {
			return null;
		}
	}
	
	// UPDATE 
	public Ninja updateNinja(Ninja b) {
		return ninjaRepo.save(b);
	}
	
	// DELETE
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
	
}