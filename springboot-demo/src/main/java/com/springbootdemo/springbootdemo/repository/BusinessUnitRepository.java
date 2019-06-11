package com.springbootdemo.springbootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.springbootdemo.model.BusinessUnit;

@Repository
public interface BusinessUnitRepository extends CrudRepository<BusinessUnit, Long>{
	
	List<BusinessUnit> findAll();	
	Optional<BusinessUnit> findById(Long id);
	@SuppressWarnings("unchecked")
	BusinessUnit save(BusinessUnit businessUnit);
	void deleteById(Long id);
	
	
	
}
