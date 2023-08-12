package com.ali.burgerTracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.burgerTracker.models.Burger;
public interface BurgerRepo extends CrudRepository<Burger, Long> {
	// Read All
		List<Burger> findAll();

}
