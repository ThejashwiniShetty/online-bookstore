package com.theju.bookstore.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String itemName;
	private String itemActualPrice;
	private String itemSellingPrice;
	private byte[] itemImage;
	private String brandName;
	private String categoryName;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemActualPrice() {
		return itemActualPrice;
	}
	public void setItemActualPrice(String itemActualPrice) {
		this.itemActualPrice = itemActualPrice;
	}
	public String getItemSellingPrice() {
		return itemSellingPrice;
	}
	public void setItemSellingPrice(String itemSellingPrice) {
		this.itemSellingPrice = itemSellingPrice;
	}
	public byte[] getItemImage() {
		return itemImage;
	}
	public void setItemImage(byte[] itemImage) {
		this.itemImage = itemImage;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
