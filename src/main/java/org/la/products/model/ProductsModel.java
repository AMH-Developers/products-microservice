package org.la.products.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "products")
public class ProductsModel implements Serializable {

	private static final long serialVersionUID = -5894452915813656430L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@Column (name = "productName")
	private String productName;
	
	@Column (name = "productCountry")
	private String productCountry;

	@Column (name = "productPrice")
	private double productPrice;
	
	@Column (name = "productQuantity")
	private int productQuantity;
	
	@Column (name = "productCategory")
	private String productCategory;
	
	
	public ProductsModel() {}


	//getter & setter
	
	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCountry() {
		return productCountry;
	}


	public void setProductCountry(String productCountry) {
		this.productCountry = productCountry;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}	
}
