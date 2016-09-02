package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Gironegocio;

public interface GironegocioDao {

	Gironegocio findById(int id);

	void saveGironegocio(Gironegocio gironegocio);
	
	void deleteGironegocioBySsn(String ssn);
	
	List<Gironegocio> findAllGironegocios();

	Gironegocio findGironegocioBySsn(String ssn);

}
