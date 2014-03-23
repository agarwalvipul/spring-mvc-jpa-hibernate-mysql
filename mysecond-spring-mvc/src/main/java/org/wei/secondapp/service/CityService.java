package org.wei.secondapp.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.wei.secondapp.model.City;
//@Transactional
public interface CityService {
	    public City create(City city);  
	    public City delete(int id) ;  
	    public List<City> findAll();  
	    public City update(City city) ;  
	    public City findById(int id);  

}
