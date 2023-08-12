package com.ali.dojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.dojoAndNinjas.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
