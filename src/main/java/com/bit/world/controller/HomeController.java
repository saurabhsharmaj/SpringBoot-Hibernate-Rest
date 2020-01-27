package com.bit.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bit.world.model.City;
import com.bit.world.model.Country;
import com.bit.world.model.State;
import com.bit.world.serivce.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService homeService;

	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return homeService.getAllCountries();
	}


	@GetMapping("/states/{countryId}")
	public List<State> getStateByCountryId(@PathVariable Integer countryId) {
		return homeService.getStateByCountryId(countryId);
	}


	@GetMapping("/cities/{stateId}")
	public List<City> getCitiesByStateId(@PathVariable Integer stateId) {
		return homeService.getCitiesByStateId(stateId);
	}

}
