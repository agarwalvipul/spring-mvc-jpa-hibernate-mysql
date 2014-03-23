package org.wei.secondapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.wei.secondapp.model.City;

//@Repository
public interface CityRepository  extends JpaRepository<City, Integer>
//, QueryDslPredicateExecutor<City>
{
	//public City create2(City city);

}

