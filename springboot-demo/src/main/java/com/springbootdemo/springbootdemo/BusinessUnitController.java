package com.springbootdemo.springbootdemo;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.springbootdemo.exception.BusinessUnitNotFoundException;
import com.springbootdemo.springbootdemo.model.BusinessUnit;
import com.springbootdemo.springbootdemo.service.BusinessUnitServiceImpl;

@RestController
public class BusinessUnitController {

	@Autowired
	BusinessUnitServiceImpl businessUnitService;

	private static final Log logger = LogFactory.getLog(BusinessUnitController.class);

	@RequestMapping(value = "/businessUnit", method = RequestMethod.GET)
	public ResponseEntity<List<BusinessUnit>> getAllBusinessUnit() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "BusinessUnitController-getAllBusinessUnit");
		return ResponseEntity.accepted().headers(headers).body(businessUnitService.findAll());

	}

	@RequestMapping(value = "/businessUnit/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<BusinessUnit>> getBusinessUnit(@PathVariable("id") long id) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "BusinessUnitController-getBusinessUnit");

		businessUnitService.findById(id).orElseThrow(() -> new BusinessUnitNotFoundException());

		return ResponseEntity.accepted().headers(headers).body(businessUnitService.findById(id));

	}

	@RequestMapping(value = "/businessUnit", method = RequestMethod.POST)
	public ResponseEntity<BusinessUnit> saveBusinessUnit(@RequestBody BusinessUnit businessUnit) {

		System.out.println("business unt is:" + businessUnit.getId());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "BusinessUnitController-saveBusinessUnit");

		return ResponseEntity.ok(businessUnitService.save(businessUnit));

	}

	@RequestMapping(value = "/businessUnit/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Optional<BusinessUnit>> deleteBusinessUnit(@PathVariable("id") long id) {

		businessUnitService.findById(id).orElseThrow(() -> new BusinessUnitNotFoundException());
		businessUnitService.deleteById(id);

		return ResponseEntity.ok().build();

	}

}
