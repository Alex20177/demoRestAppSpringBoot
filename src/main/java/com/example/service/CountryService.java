package com.example.service;

import java.util.List;

import com.example.entity.Country;
import com.example.entity.Location;

public interface CountryService {
	
	List<Country> getAll();
	
	Long getNumRecords();
	
	List<Location> getLocationsByCountryId(String countryId);
	
	Country getContryById(String id);

}
