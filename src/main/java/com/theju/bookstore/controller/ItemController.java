package com.theju.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;
import com.theju.bookstore.service.ItemService;

@Controller
@RequestMapping(value = "/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/allBrands", method = RequestMethod.GET)
	public List<BrandDetail> getAllBrands() {  
		List<BrandDetail> brandDetails = itemService.getAllBrands();
		for (BrandDetail brandDetail : brandDetails) {
			System.out.println("Avaliable brand: "+brandDetail.getBrandName());
		}
		return brandDetails;
	}  
	
	@RequestMapping(value = "/allCategories", method = RequestMethod.GET)
	public List<CategoriesDetail> getAllCategories() {  
		List<CategoriesDetail> categoriesDetails = itemService.getAllCategories();
		for (CategoriesDetail categoriesDetail : categoriesDetails) {
			System.out.println("Avaliable Category: "+categoriesDetail.getCategoryName());
		}
		return categoriesDetails;
	}  

}
