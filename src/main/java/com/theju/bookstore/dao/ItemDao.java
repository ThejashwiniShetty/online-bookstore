package com.theju.bookstore.dao;

import java.util.List;

import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;

public interface ItemDao extends BaseDao {

	List<BrandDetail> getAllBrands();

	List<CategoriesDetail> getAllCategories();

}
