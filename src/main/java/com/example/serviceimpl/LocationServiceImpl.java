package com.example.serviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.entity.Location;
import com.example.repository.CountryRepository;
import com.example.repository.LocationRepository;
import com.example.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public List<Location> getLocationByCountryId(String countryId) {
		
		Optional<Country> country = countryRepository.findById(countryId);
		
		if(country.isPresent()) {
			List<Location> locations=locationRepository.findByCountry(country.get());
			if(CollectionUtils.isNotEmpty(locations)) {
				return locations;
			}
		}
		
		return Collections.emptyList();
	}

}
