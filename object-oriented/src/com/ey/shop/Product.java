package com.ey.shop;
/**
 * @author Satyam
 * @version 1.0
 */
public class Product {
	
	private String name;
	private double price;
	
	/**
	 * This is the default constructor.
	 */
	
	public Product() {

}
	/**
	 * This is the parameterized constructor.
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	/**
	 * This method prints the details of the product.
	 */
	public void print() {
		System.out.println("Name: " + name + "\tPrice: " + price);
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public double getPrice() {
		return price;
	}
	}
	
	
