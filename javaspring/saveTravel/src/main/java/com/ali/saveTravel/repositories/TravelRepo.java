package com.ali.saveTravel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.saveTravel.models.Travel;

public interface TravelRepo extends CrudRepository<Travel, Long> {
	List<Travel> findAll();
}
