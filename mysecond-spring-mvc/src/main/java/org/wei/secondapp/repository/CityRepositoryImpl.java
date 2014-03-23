package org.wei.secondapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.wei.secondapp.model.City;


//@Transactional
@Repository
public class CityRepositoryImpl 
//extends SimpleJpaRepository<City, Integer> 
implements CityRepository {
	@PersistenceContext(unitName = "mySql2") 
	EntityManager em;
	
	
	//@Autowired
	
//	public CityRepositoryImpl(EntityManagerFactory  emf ) {
//		
//		super(City.class, emf.createEntityManager());
//		em=emf.createEntityManager();
//		// TODO Auto-generated constructor stub
//	}
	
//	public CityRepositoryImpl(EntityManager  em ) {
//		
//		super(City.class, em);
//		this.em=em;
//		
//	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<City> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public City getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City saveAndFlush(City arg0) {
	//	boolean isactive=em.getTransaction().isActive();
		em.persist(arg0);
		em.flush();
		return arg0;
	}

	@Override
	public Page<City> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends City> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public City findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> S save(S arg0) {
		em.persist(arg0);
		return arg0;
	}
	
	

}
