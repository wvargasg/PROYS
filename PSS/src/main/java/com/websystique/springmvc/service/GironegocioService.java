package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Gironegocio;

public interface GironegocioService {

	Gironegocio findById(int id);
	
	void saveGironegocio(Gironegocio gironegocio);
	
	void updateGironegocio(Gironegocio gironegocio);
	
	void deleteGironegocioBySsn(String ssn);

	List<Gironegocio> findAllGironegocios(); 
	
	Gironegocio findGironegocioBySsn(String ssn);

	boolean isGironegocioSsnUnique(Integer id, String ssn);
	
}
