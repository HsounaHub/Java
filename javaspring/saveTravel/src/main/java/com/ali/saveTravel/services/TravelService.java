package com.ali.saveTravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.saveTravel.models.Travel;
import com.ali.saveTravel.repositories.TravelRepo;

@Service
public class TravelService {
	// === CRUD ===
	
	@Autowired
	private TravelRepo travelRepo;
	
	// READ ALL
	public List<Travel> allTravels(){
		return travelRepo.findAll();
	}
	
	// CREATE
	public Travel createTravel(Travel b) {
		return travelRepo.save(b);
	}
	
	// READ ONE
	public Travel findTravel(Long id) {
		
		Optional<Travel> maybeTravel = travelRepo.findById(id);
		if(maybeTravel.isPresent()) {
			return maybeTravel.get();
		}else {
			return null;
		}
	}
	
	// UPDATE 
	public Travel updateTravel(Travel b) {
		return travelRepo.save(b);
	}
	
	// DELETE
	public void deleteTravel(Long id) {
		travelRepo.deleteById(id);
	}
	
}