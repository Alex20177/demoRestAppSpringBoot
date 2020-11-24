package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Location;
import com.example.service.CountryService;

@RestController
@RequestMapping(path = "/custom-country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/{countryId}")
	public List<Location> getLocationByCountryId(@PathVariable(name = "countryId") String countryId){
		return countryService.getContryById(countryId).getLocations();
	}

}
