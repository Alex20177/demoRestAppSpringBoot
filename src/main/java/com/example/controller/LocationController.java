package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Location;
import com.example.repository.LocationRepository;
import com.example.service.LocationService;

@RestController
@RequestMapping("/custom-location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private LocationRepository locationRepository; 
	
	@GetMapping("/")
	public Location getLocationByCountryId(){
		Location location = locationRepository.findById(1000).get();
		return location;
	}
		
}
