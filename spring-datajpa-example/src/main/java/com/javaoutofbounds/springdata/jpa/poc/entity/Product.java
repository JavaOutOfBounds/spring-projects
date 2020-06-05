package com.javaoutofbounds.springdata.jpa.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "products")
@DynamicUpdate
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "pid")
	private int prductId;
	@Column(name = "prod_desc")
	private String productDesc;
	@Column(name = "prod_name", nullable = false)
	private String productName;
	@Column(name = "prod_cost", nullable = false)
	private String productCost;
	@Column(name = "prod_status")
	private String productStatus;

	public Product() {

	}

	public Product(String productDesc, String productName, String productCost, String productStatus) {
		super();
		this.productDesc = productDesc;
		this.productName = productName;
		this.productCost = productCost;
		this.productStatus = productStatus;
	}

	public int getPrductId() {
		return prductId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCost() {
		return productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Product [prductId=" + prductId + ", productDesc=" + productDesc + ", productName=" + productName
				+ ", productCost=" + productCost + ", productStatus=" + productStatus + "]";
	}



}