package com.example.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	
	@Id
	@Column(name="COUNTRY_ID")
	private String countryId;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
	private List<Location> locations;
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName 
				+ ", region=" + region.getRegionName() + "]";
	} 

}
