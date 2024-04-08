package com.learning.core.day3session3;


	import java.util.*;
	 
	class Product {
	    private String productId;
	    private String productName;
	 
	    public Product(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }
	 
	    public String getProductId() {
	        return productId;
	    }
	 
	    public String getProductName() {
	        return productName;
	    }
	 
	    @Override
	    public String toString() {
	        return productId + " " + productName;
	    }

		public Object ProductId() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	 
	public class DO3P72 {
	    public static void main(String[] args) {
	        HashSet<Product> productSet = new HashSet<>();
	 
	        // Predefined information of 4 products
	        Product product1 = new Product("P001", "Maruti 800");
	        Product product2 = new Product("P002", "Maruti Zen");
	        Product product3 = new Product("P003", "Maruti Dezire");
	        Product product4 = new Product("P004", "Maruti Alto");
	 
	        // Adding products to the HashSet
	        productSet.add(product1);
	        productSet.add(product2);
	        productSet.add(product3);
	        productSet.add(product4);
	 
	        // List all the product details
	        for (Product product : productSet) {
	            System.out.println(product);
	        }
	    }
	}

