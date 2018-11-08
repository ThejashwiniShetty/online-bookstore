package com.theju.bookstore.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS_DETAIL")
public class ItemsDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ITEM_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;
	
	@Column(name="ITEM_PART_NUMBER")
	private String itemPartNumber;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="ITEM_ACTUAL_PRICE")
	private Double itemActualPrice;
	
	@Column(name="ITEM_SELLING_PRICE")
	private Double itemSellingPrice;
	
	@Column(name="ITEM_AVAILABLE_QUANTITY")
	private Long itemAvailableQuantity;
	
	@Column(name="ITEM_TOTAL_QUANTITY")
	private Long itemTotalQuantity;
	
	@Column(name="ITEM_IMAGE")
	private byte[] itemImage;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;
	
	@Column(name="CREATED_BY")
	private Integer createdBy;
	
	@Column(name="MODIFIED_BY")
	private Integer modifiedBy;
	
	@Column(name="DELETED")
	private Character deleted;
	
	@OneToOne
	@JoinColumn(name="ITEM_BRAND_ID")
	private BrandDetail brandDetail;
	
	@OneToOne
	@JoinColumn(name="ITEM_CATEGORY_ID")
	private CategoriesDetail categoriesDetail;
	
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	public String getItemPartNumber() {
		return itemPartNumber;
	}

	public void setItemPartNumber(String itemPartNumber) {
		this.itemPartNumber = itemPartNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemActualPrice() {
		return itemActualPrice;
	}

	public void setItemActualPrice(Double itemActualPrice) {
		this.itemActualPrice = itemActualPrice;
	}

	public Double getItemSellingPrice() {
		return itemSellingPrice;
	}

	public void setItemSellingPrice(Double itemSellingPrice) {
		this.itemSellingPrice = itemSellingPrice;
	}

	public Long getItemAvailableQuantity() {
		return itemAvailableQuantity;
	}

	public void setItemAvailableQuantity(Long itemAvailableQuantity) {
		this.itemAvailableQuantity = itemAvailableQuantity;
	}

	public Long getItemTotalQuantity() {
		return itemTotalQuantity;
	}

	public void setItemTotalQuantity(Long itemTotalQuantity) {
		this.itemTotalQuantity = itemTotalQuantity;
	}

	public byte[] getItemImage() {
		return itemImage;
	}

	public void setItemImage(byte[] itemImage) {
		this.itemImage = itemImage;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Character getDeleted() {
		return deleted;
	}

	public void setDeleted(Character deleted) {
		this.deleted = deleted;
	}

	public BrandDetail getBrandDetail() {
		return brandDetail;
	}

	public void setBrandDetail(BrandDetail brandDetail) {
		this.brandDetail = brandDetail;
	}

	public CategoriesDetail getCategoriesDetail() {
		return categoriesDetail;
	}

	public void setCategoriesDetail(CategoriesDetail categoriesDetail) {
		this.categoriesDetail = categoriesDetail;
	}

}
