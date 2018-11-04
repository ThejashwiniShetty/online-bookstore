package com.theju.bookstore.service;

import java.util.List;

import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;

public interface ItemService {

	List<BrandDetail> getAllBrands();

	List<CategoriesDetail> getAllCategories();

}
