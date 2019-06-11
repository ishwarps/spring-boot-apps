package com.springbootdemo.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// @Table(name = "business_unit", schema = "address_service")
@Table(name = "BUSINESS_UNIT")
public class BusinessUnit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "BUSINESS_UNIT_ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitDesc() {
		return unitDesc;
	}

	public void setUnitDesc(String unitDesc) {
		this.unitDesc = unitDesc;
	}

	@Column(name = "UNIT_NAME")
	private String unitName;

	@Column(name = "UNIT_DESC")
	private String unitDesc;

}
