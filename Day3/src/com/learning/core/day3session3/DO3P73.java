package com.learning.core.day3session3;

import java.util.HashSet;

public class DO3P73 {
	
	    public static void main(String[] args) {
	        // Predefined product information
	        Product product1 = new Product("P001", "iPhone 12");
	        Product product2 = new Product("P002", "Samsung Galaxy S21");
	        Product product3 = new Product("P003", "Maruti Dezire");
	        Product product4 = new Product("P004", "Sony PlayStation 5");
	 
	        // Store products in a HashSet
	        HashSet<Product> productHashSet = new HashSet<>();
	        productHashSet.add(product1);
	        productHashSet.add(product2);
	        productHashSet.add(product3);
	        productHashSet.add(product4);
	 
	        // Search for a particular product
	        String searchProductId = "P003";
	        boolean found = false;
	        for (Product product : productHashSet) {
	            if (product.getProductId().equals(searchProductId)) {
	                found = true;
	                break;
	            }
	        }
	 
	        // Output result
	        if (found) {
	            System.out.println("Product Found");
	        } else {
	            System.out.println("Product Not Found");
	        }
	    }
	}