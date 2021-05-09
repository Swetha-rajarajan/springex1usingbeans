package com.hcl.springFirstProject;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private int productQty;
	
	
	public Product(int productId, String productName, double productPrice, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	
	public Product() {
		super();
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public void display() {
		
		System.out.println(getProductId());
		System.out.println(getProductName());
		System.out.println(getProductPrice());
		System.out.print(getProductQty());
	}
	
	
	

}
