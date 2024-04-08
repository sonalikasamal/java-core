package com.learning.core.day3session3;

import java.util.HashSet;

public class DO3P74 {
	 public static void main(String[] args) {
	        HashSet<Product> products = new HashSet<>();
	        // Predefined information of 4 products
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Swift"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));
	 
	        // Removing a particular product by product id
	        String productIdToRemove = "P002";
	        products.removeIf(product -> product.getProductId().equals(productIdToRemove));
	 
	        // Printing the remaining products
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	}


