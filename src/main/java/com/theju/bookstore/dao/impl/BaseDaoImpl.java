package com.theju.bookstore.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theju.bookstore.dao.BaseDao;
import com.theju.bookstore.domain.ItemsDetail;

@Repository
public class BaseDaoImpl implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Gets the Session Factory object
	 * 
	 */
	protected final Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public <T extends Serializable> T fetchEntityById(Class<T> entityClass, Serializable id) {
		return entityClass.cast(getSession().get(entityClass, id));
	}
	
	public <T extends Serializable> List<T> fetchAllEntities(Class<T> entityClass) {
		return createCriteria(entityClass).list();
	}
	
	public boolean saveOrUpdate(ItemsDetail itemsDetail) {
		getSession().saveOrUpdate(itemsDetail);
		return false;
	}
	
	public Criteria createCriteria(Class<? extends Serializable> persistentClass) {
		return getSession().createCriteria(persistentClass);
	}

}
