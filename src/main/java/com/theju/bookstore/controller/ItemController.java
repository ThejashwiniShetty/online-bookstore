package com.theju.bookstore.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.theju.bookstore.domain.BrandDetail;
import com.theju.bookstore.domain.CategoriesDetail;
import com.theju.bookstore.dto.ItemsDto;
import com.theju.bookstore.service.ItemService;
import com.theju.bookstore.util.CommonUtil;
import com.theju.bookstore.util.Constants;

@Controller
@RequestMapping(value = "/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private CommonUtil commonUtil;

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
	
	@RequestMapping(value = "/addOrUpdateItem", method = RequestMethod.POST)
	public String addOrUpdateItem(ItemsDto itemsDto, @RequestParam(value = "itemImage", required = true) MultipartFile itemImage) {
		if(StringUtils.isEmpty(itemsDto.getItemPartNumber())) {
			commonUtil.generatePartNumber(Constants.ITEM_PN_BEGIN_VAL);
		} else {
			System.out.println("PN already exists. Update Item.");
			commonUtil.validatePartNumber(itemsDto.getItemPartNumber());
		}
		itemService.saveOrUpdateItem(itemsDto);
		return "itemsPage";
	}

}
