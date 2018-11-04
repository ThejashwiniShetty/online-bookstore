package com.theju.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theju.bookstore.dao.ItemDao;
import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;
import com.theju.bookstore.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;

	public List<BrandDetail> getAllBrands() {
		return this.itemDao.getAllBrands();
	}

	public List<CategoriesDetail> getAllCategories() {
		return this.itemDao.getAllCategories();
	}

}
