package com.gluedigital.glue.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gluedigital.glue.dao.GarmentDao;
import com.gluedigital.glue.dto.request.HeightRequest;
import com.gluedigital.glue.dto.response.GarmentDetail;
import com.gluedigital.glue.model.Garment;
import com.gluedigital.glue.service.SortService;

@Service
public class SortServiceImpl implements SortService{
	
	@Autowired
	GarmentDao garmentDao;
	
	public List<GarmentDetail> sortList(HeightRequest heightRequest){
		
		if(heightRequest.getStock() == null || heightRequest.getUnitSales() == null || heightRequest.getStock() + heightRequest.getUnitSales() != 100) {
			return new ArrayList<GarmentDetail>();
		}
		List<Garment> bBDDGarmentList = garmentDao.findAll();
		List<GarmentDetail> garmenDetailList = new ArrayList<>();	
		
		bBDDGarmentList.stream().forEach(garment -> {
			GarmentDetail garmentDetail = new GarmentDetail();
			BeanUtils.copyProperties(garment, garmentDetail);
			garmentDetail.setMean(garmentDetail.getSalesUnit()*(heightRequest.getUnitSales()/100) + (garmentDetail.getSizeS()+garmentDetail.getSizeM() + garmentDetail.getSizeL()) * (heightRequest.getStock()/100));
			garmenDetailList.add(garmentDetail);
		});
		
        List<GarmentDetail> sortedGarmentDetailList = garmenDetailList.stream()
			.sorted(Comparator.comparingDouble(GarmentDetail::getMean).reversed())
			.collect(Collectors.toList());
        return sortedGarmentDetailList;
	}
}
