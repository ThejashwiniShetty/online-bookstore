package com.theju.bookstore.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.theju.bookstore.dao.ItemDao;
import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;

@Repository
public class ItemDaoImpl extends BaseDaoImpl implements ItemDao{

	@Transactional
	public List<BrandDetail> getAllBrands() {
		return super.fetchAllEntities(BrandDetail.class);
	}

	@Transactional
	public List<CategoriesDetail> getAllCategories() {
		return super.fetchAllEntities(CategoriesDetail.class);
	}

}
