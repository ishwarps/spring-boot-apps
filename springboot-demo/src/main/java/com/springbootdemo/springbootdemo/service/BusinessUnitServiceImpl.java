package com.springbootdemo.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdemo.springbootdemo.model.BusinessUnit;
import com.springbootdemo.springbootdemo.repository.BusinessUnitRepository;

@Service
public class BusinessUnitServiceImpl implements BusinessUnitService {

	@Autowired
	BusinessUnitRepository businessUnitReposioty;

	@Override
	public List<BusinessUnit> findAll() {

		return businessUnitReposioty.findAll();
	}

	@Override
	public Optional<BusinessUnit> findById(Long id) {

		return businessUnitReposioty.findById(id);
	}

	@Override
	public BusinessUnit save(BusinessUnit businessUnit) {
		return businessUnitReposioty.save(businessUnit);
	}

	@Override
	public void deleteById(Long id) {
		
		businessUnitReposioty.deleteById(id);
	}

}
