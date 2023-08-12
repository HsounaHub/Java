package com.ali.dojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.dojoAndNinjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
