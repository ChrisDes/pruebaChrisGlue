package com.gluedigital.glue.service;

import java.util.List;

import com.gluedigital.glue.dto.request.HeightRequest;
import com.gluedigital.glue.dto.response.GarmentDetail;

public interface SortService {
	
	public List<GarmentDetail> sortList(HeightRequest heightRequest);
}
