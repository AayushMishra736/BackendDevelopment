package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Country;
import com.springboot.repositories.CountryRepository;



@Service
public class CountryService {

	@Autowired
	CountryRepository countryrepo;

	public List<Country> getAllCountries() {
		List<Country> countries = countryrepo.findAll();
		return countries;
	}

	public Country getCountryByID(int id) {
		List<Country> countries = countryrepo.findAll();
		Country country = null;
		for (Country con : countries) {
			if (con.getId() == id)
				country = con;
		}
		return country;
	}

	public Country addCountry(Country country) {
		country.setId(getMaxId());
		countryrepo.save(country);
		return country;
	}

	public int getMaxId() {
		return countryrepo.findAll().size() + 1;
	}

	public Country updateCountry(Country country) {
		countryrepo.save(country);
		return country;

	}

	public void deleteCountry(Country country) {
		countryrepo.delete(country);

	}

}
