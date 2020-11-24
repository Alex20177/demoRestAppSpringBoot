package com.example.service;

import java.util.List;

import com.example.entity.Location;

public interface LocationService {
	
	List<Location> getLocationByCountryId(String countryId);

}
