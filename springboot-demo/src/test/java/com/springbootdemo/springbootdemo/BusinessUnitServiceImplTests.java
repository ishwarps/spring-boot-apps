package com.springbootdemo.springbootdemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.springbootdemo.springbootdemo.model.BusinessUnit;
import com.springbootdemo.springbootdemo.repository.BusinessUnitRepository;
import com.springbootdemo.springbootdemo.service.BusinessUnitServiceImpl;



@RunWith(MockitoJUnitRunner.class)
public class BusinessUnitServiceImplTests {

	@Mock
	BusinessUnitRepository businessUnitRepositoryMock;

	@InjectMocks
	BusinessUnitServiceImpl businessUnitServiceImpl;

	@Test
	public void findById() {

		List<BusinessUnit> businessUnitList = new ArrayList<BusinessUnit>();

		BusinessUnit businessUnit = new BusinessUnit();
		businessUnit.setId((long) 10);
		businessUnit.setUnitName("VIOC ");
		businessUnit.setUnitDesc("Valvoline Instant Oil Change");
		businessUnitList.add(businessUnit);
		when(businessUnitRepositoryMock.findById(1l)).thenReturn(Optional.of(businessUnit));

		assertEquals(Long.valueOf("10"), businessUnitServiceImpl.findById(1l).get().getId());

	}

	@Test
	public void findAll() {

		List<BusinessUnit> businessUnitList = new ArrayList<BusinessUnit>();

		BusinessUnit businessUnit = new BusinessUnit();
		businessUnit.setId((long) 10);
		businessUnit.setUnitName("VIOC ");
		businessUnit.setUnitDesc("Valvoline Instant Oil Change");
		businessUnitList.add(businessUnit);
		when(businessUnitRepositoryMock.findAll()).thenReturn(businessUnitList);

		assertEquals(1, businessUnitServiceImpl.findAll().size());

	}

}
