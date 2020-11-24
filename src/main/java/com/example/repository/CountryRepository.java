package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
	
	

}
