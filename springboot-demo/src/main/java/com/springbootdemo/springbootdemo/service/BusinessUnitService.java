package com.springbootdemo.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import com.springbootdemo.springbootdemo.model.BusinessUnit;

public interface BusinessUnitService {
	
	public List<BusinessUnit> findAll();
	public Optional<BusinessUnit> findById(Long id);
    public BusinessUnit save(BusinessUnit businessUnit);
    public void deleteById(Long id);
}
