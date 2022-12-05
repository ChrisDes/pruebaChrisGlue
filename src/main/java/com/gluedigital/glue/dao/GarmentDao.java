package com.gluedigital.glue.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gluedigital.glue.model.Garment;

@Repository
public interface GarmentDao extends CrudRepository<Garment, Long> {
	List<Garment> findAll();
	
}
