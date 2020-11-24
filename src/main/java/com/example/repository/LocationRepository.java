package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Country;
import com.example.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	List<Location> findByCountry(Country country);

}
