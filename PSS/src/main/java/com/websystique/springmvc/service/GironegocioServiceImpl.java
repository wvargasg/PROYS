package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.GironegocioDao;
import com.websystique.springmvc.model.Gironegocio;

@Service("gironegocioService")
@Transactional
public class GironegocioServiceImpl implements GironegocioService {

	@Autowired
	private GironegocioDao dao;
	
	public Gironegocio findById(int id) {
		return dao.findById(id);
	}

	public void saveGironegocio(Gironegocio gironegocio) {
		dao.saveGironegocio(gironegocio);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateGironegocio(Gironegocio gironegocio) {
		Gironegocio entity = dao.findById(gironegocio.getIdGironegocio());
		if(entity!=null){
			entity.setDescripcion(gironegocio.getDescripcion());
			entity.setEstadoGironeg(gironegocio.getEstadoGironeg());
		}
	}

	public void deleteGironegocioBySsn(String ssn) {
		dao.deleteGironegocioBySsn(ssn);
	}
	
	public List<Gironegocio> findAllGironegocios() {
		return dao.findAllGironegocios();
	}

	public Gironegocio findGironegocioBySsn(String ssn) {
		return dao.findGironegocioBySsn(ssn);
	}

	public boolean isGironegocioSsnUnique(Integer id, String ssn) {
		Gironegocio gironegocio = findGironegocioBySsn(ssn);
		return ( gironegocio == null || ((id != null) && (gironegocio.getIdGironegocio() == id)));
	}
	
}
