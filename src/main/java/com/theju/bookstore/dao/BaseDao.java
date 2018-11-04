package com.theju.bookstore.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {

	/**
	 * Fetches entity for given primary key
	 * @param entityClass
	 * @param id
	 * @return 
	 */
	<T extends Serializable> T fetchEntityById(Class<T> entityClass, Serializable id);

	/**
	 * 
	 * Fetches all entities
	 * @param entityClass
	 * @return
	 */
	<T extends Serializable> List<T> fetchAllEntities(Class<T> entityClass);
}
