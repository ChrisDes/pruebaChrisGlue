package com.gluedigital.glue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gluedigital.glue.dto.request.HeightRequest;
import com.gluedigital.glue.dto.response.GarmentDetail;
import com.gluedigital.glue.service.SortService;

@RestController
@RequestMapping("/api")
public class FilterController {

	@Autowired
	SortService sortService;
	
	@PostMapping("/getFilteredListByHeight")
	public List<GarmentDetail> allPersons(@RequestBody HeightRequest heightRequest){
		return sortService.sortList(heightRequest);
	}
	
}
