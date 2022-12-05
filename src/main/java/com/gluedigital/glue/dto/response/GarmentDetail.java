package com.gluedigital.glue.dto.response;

import java.math.BigDecimal;

public class GarmentDetail {
	
	private Long id;
	
	private String name;
	
	private Double salesUnit;
	
	private Double sizeS;
	
	private Double sizeM;
	
	private Double sizeL;
	
	private Double mean;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Double getSalesUnit() {
		return salesUnit;
	}

	public void setSalesUnit(Double salesUnit) {
		this.salesUnit = salesUnit;
	}

	public Double getSizeS() {
		return sizeS;
	}

	public void setSizeS(Double sizeS) {
		this.sizeS = sizeS;
	}

	public Double getSizeM() {
		return sizeM;
	}

	public void setSizeM(Double sizeM) {
		this.sizeM = sizeM;
	}

	public Double getSizeL() {
		return sizeL;
	}

	public void setSizeL(Double sizeL) {
		this.sizeL = sizeL;
	}

	public Double getMean() {
		return mean;
	}

	public void setMean(Double mean) {
		this.mean = mean;
	}
	
	

}
