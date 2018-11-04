package com.theju.bookstore.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BRAND_DETAIL")
public class BrandDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="BRAND_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer brandId;
	
	@Column(name="BRAND_NAME")
	private String brandName;
	
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
	
	@OneToMany(mappedBy = "brandDetail")
	private List<ItemsDetail> itemsDetail;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
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

	public List<ItemsDetail> getItemsDetail() {
		return itemsDetail;
	}

	public void setItemsDetail(List<ItemsDetail> itemsDetail) {
		this.itemsDetail = itemsDetail;
	}
	
}
