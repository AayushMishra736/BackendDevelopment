package com.springboot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springboot.controller.CountryController;
import com.springboot.entities.Country;
import com.springboot.service.CountryService;


@SpringBootTest(classes = {ControllerMockitoTests.class })
public class ControllerMockitoTests {

	@Mock
	CountryService countryService;

	@InjectMocks
	CountryController countryController;

	List<Country> mycountries;

	Country country;

	@Test
	public void test_getCountries() {
		mycountries = new ArrayList<Country>();
		mycountries.add(new Country(1, "India", "Delhi"));
		mycountries.add(new Country(2, "USA", "Washington"));

		when(countryService.getAllCountries()).thenReturn(mycountries);// mocking
		ResponseEntity<List<Country>> res = countryController.getCountries();
		assertEquals(HttpStatus.FOUND, res.getStatusCode());
		assertEquals(2, res.getBody().size());
	}

	@Test
	public void test_getCountryById() {
		country = new Country(2, "USA", "Washignton");
		int countryID = 2;

		when(countryService.getCountryByID(countryID)).thenReturn(country);
		ResponseEntity<Country> res = countryController.getCountryById(countryID);
		assertEquals(HttpStatus.FOUND, res.getStatusCode());
		assertEquals(countryID, res.getBody().getId());
	}

	@Test
	public void test_addCountry() {
		country = new Country(3, "Germany", "Berlin");
		when(countryService.addCountry(country)).thenReturn(country);
		ResponseEntity<Country> res = countryController.addCountry(country);
		assertEquals(HttpStatus.CREATED, res.getStatusCode());
		assertEquals(country, res.getBody());
	}

	@Test
	public void test_updateCountry() {
		country = new Country(3, "Japan", "Tokyo");
		int countryID = 3;
		when(countryService.getCountryByID(countryID)).thenReturn(country);
		when(countryService.updateCountry(country)).thenReturn(country);
		ResponseEntity<Country> res = countryController.updateCountry(countryID, country);
		assertEquals(HttpStatus.OK, res.getStatusCode());
		assertEquals(3, res.getBody().getId());
		assertEquals("Japan", res.getBody().getCountryName());
		assertEquals("Tokyo", res.getBody().getCountryCapital());

	}

	@Test
	public void test_deleteCountry() {
		country = new Country(3, "Japan", "Tokyo");
		int countryID = 3;
		when(countryService.getCountryByID(countryID)).thenReturn(country);
		ResponseEntity<Country> res = countryController.deleteCountry(countryID);
		assertEquals(HttpStatus.OK, res.getStatusCode());

	}

}
