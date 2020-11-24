package com.example.serviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.entity.Location;
import com.example.repository.CountryRepository;
import com.example.service.CountryService;

@Service
public class ContryServiceImpl implements CountryService{

	@Autowired
	private CountryRepository countryRepository; 
	
	@Override
	public List<Country> getAll() {

		return StreamSupport
				  .stream(countryRepository.findAll().spliterator(), false)
				  .collect(Collectors.toList());
	}

	@Override
	public Long getNumRecords() {
		return countryRepository.count();
	}

	@Override
	public List<Location> getLocationsByCountryId(String countryId) {
		
		Optional<Country> country = countryRepository.findById(countryId);
		
		if(country.isPresent())
			return country.get().getLocations();
		else
			return Collections.emptyList();
		
	}

	@Override
	public Country getContryById(String id) {
		return countryRepository.findById(id).get();
	}

	
	
}
