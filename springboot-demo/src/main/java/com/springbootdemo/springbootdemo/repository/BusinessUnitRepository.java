package com.springbootdemo.springbootdemo.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.springbootdemo.model.BusinessUnit;

@Repository
public interface BusinessUnitRepository extends CrudRepository<BusinessUnit, Long> {

	List<BusinessUnit> findAll();

	Optional<BusinessUnit> findById(Long id);

	@SuppressWarnings("unchecked")
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	/*@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Lock(LockModeType.PESSIMISTIC_FORCE_INCREMENT)*/
	
	BusinessUnit save(BusinessUnit businessUnit);

	void deleteById(Long id);

}
