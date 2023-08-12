package com.ali.dojoAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.dojoAndNinjas.models.Dojo;
import com.ali.dojoAndNinjas.repositories.DojoRepo;

@Service
public class DojoService {
	// === CRUD ===
	
	@Autowired
	private DojoRepo dojoRepo;
	
	// READ ALL
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	// CREATE
	public Dojo createDojo(Dojo b) {
		return dojoRepo.save(b);
	}
	
	// READ ONE
		public Dojo findDojo(Long id) {
			
			Optional<Dojo> maybeDojo = dojoRepo.findById(id);
			if(maybeDojo.isPresent()) {
				return maybeDojo.get();
			}else {
				return null;
			}
		}
	

	
}
