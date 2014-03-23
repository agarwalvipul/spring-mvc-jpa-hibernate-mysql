package org.wei.secondapp.service;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wei.secondapp.model.City;
import org.wei.secondapp.repository.CityRepository;
//@Transactional
@Service
public class CityServiceImpl implements CityService {

	@Resource
	//@Autowired
	private CityRepository cityRepository;
	
	private EntityManagerFactory emf;
	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
	this.emf = emf;
	}
	
	EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) { this.em = em; }

	@Override
	//@Transactional
	//("default")
	public City create(City city) {
		
		
//		entityManagerFactory.getObject().createEntityManager().persist(city);
//		EntityManager em=emf.createEntityManager();
//		boolean isactive=em.getTransaction().isActive();
//	//	em.getTransaction().begin();
//		em.persist(city);
//		em.flush();
//		//em.getTransaction().commit();
//		 return city;

		return cityRepository.saveAndFlush(city);
	}

	@Override
	@Transactional
	public City delete(int id) {
		City deletedCity = cityRepository.findOne(id);

		if (deletedCity == null)
			return null;

		cityRepository.delete(deletedCity);
		return deletedCity;

	}

	@Override
	@Transactional
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	@Transactional
	public City update(City city) {
		City updatedShop = cityRepository.findOne(city.getId());

		if (updatedShop == null)
			return create(city);

		updatedShop.setName(city.getName());
		// updatedShop.setEmplNumber(shop.getEmplNumber());

		return updatedShop;
	}

	@Override
	@Transactional
	public City findById(int id) {
		// TODO Auto-generated method stub
		return cityRepository.findOne(id);
	}

}
