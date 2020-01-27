package com.bit.world.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.bit.world.model.City;
import com.bit.world.model.Country;
import com.bit.world.model.State;

@Repository
public class HomeDao {

	private SessionFactory sessionFactory;

	@Autowired
	public HomeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Country> getAllCountries() {
		Session session = this.sessionFactory.getCurrentSession();		
		return session.createCriteria(Country.class).list();
	}

	public List<State> getStateByCountryId(@PathVariable Integer countryId) {
		Session session = this.sessionFactory.getCurrentSession();	
		return session.createCriteria(State.class).add(Restrictions.eq("countryId", countryId)).list();
	}

	public List<City> getCitiesByStateId(@PathVariable Integer stateId) {
		Session session = this.sessionFactory.getCurrentSession();	
		return session.createCriteria(City.class).add(Restrictions.eq("stateId", stateId)).list();
	}
}
