package com.bit.world.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bit.world.dao.HomeDao;
import com.bit.world.model.City;
import com.bit.world.model.Country;
import com.bit.world.model.State;

@Service
public class HomeService {

	@Autowired
	HomeDao homeDao;
	
	
	public List<Country> getAllCountries() {
		return homeDao.getAllCountries();
	}


	
	public List<State> getStateByCountryId(@PathVariable Integer countryId) {
		return homeDao.getStateByCountryId(countryId);
	}


	
	public List<City> getCitiesByStateId(@PathVariable Integer stateId) {
		return homeDao.getCitiesByStateId(stateId);
	}
	
}
