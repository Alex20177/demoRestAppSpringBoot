package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.CountryService;

@SpringBootApplication
public class DemoRestAppApplication implements CommandLineRunner{
	
	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(DemoRestAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Num countries = "+countryService.getNumRecords());
		countryService.getAll().forEach(System.out::println);
		
	}

}
