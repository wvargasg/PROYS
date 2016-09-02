package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Gironegocio;

@Repository("gironegocioDao")
public class GironegocioDaoImpl extends AbstractDao<Integer, Gironegocio> implements GironegocioDao {

	public Gironegocio findById(int id) {
		return getByKey(id);
	}

	public void saveGironegocio(Gironegocio gironegocio) {
		persist(gironegocio);
	}

	public void deleteGironegocioBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Gironegocio where ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Gironegocio> findAllGironegocios() {
		Criteria criteria = createEntityCriteria();
		return (List<Gironegocio>) criteria.list();
	}

	public Gironegocio findGironegocioBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", ssn));
		return (Gironegocio) criteria.uniqueResult();
	}
}
