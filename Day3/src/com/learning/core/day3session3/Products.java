package com.learning.core.day3session3;

class Products {
	    private String productId;
	    private String productName;
	 
	    public Products(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }
	 
	    public String getProductId() {
	        return productId;
	    }
	 
	    public String getProductName() {
	        return productName;
	    }
	 
	    // Override hashCode and equals methods for HashSet to work correctly
	    @Override
	    public int hashCode() {
	        return productId.hashCode();
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Product product = (Product) obj;
	        return productId.equals(product.getProductId());
	    }
	}