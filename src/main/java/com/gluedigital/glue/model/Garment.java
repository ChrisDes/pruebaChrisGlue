package com.gluedigital.glue.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GARMENT")
public class Garment{
	
	private Long id;
	
	private String name;
	
	private Double salesUnit;
	
	private Double sizeS;
	
	private Double sizeM;
	
	private Double sizeL;

	@Id
	@Column(name="id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="sales_unit")
	public Double getSalesUnit() {
		return salesUnit;
	}

	public void setSalesUnit(Double salesUnit) {
		this.salesUnit = salesUnit;
	}

	@Column(name="quantitys")
	public Double getSizeS() {
		return sizeS;
	}



	public void setSizeS(Double sizeS) {
		this.sizeS = sizeS;
	}
	
	@Column(name="quantitym")
	public Double getSizeM() {
		return sizeM;
	}

	public void setSizeM(Double sizeM) {
		this.sizeM = sizeM;
	}
	
	@Column(name="quantityl")
	public Double getSizeL() {
		return sizeL;
	}

	public void setSizeL(Double sizeL) {
		this.sizeL = sizeL;
	}
	
	
	
	
	
}
