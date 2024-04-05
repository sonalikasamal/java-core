package com.learning.core.day2session2;

	class LowBalanceException extends Exception {
	    public LowBalanceException(String message) {
	        super(message);
	    }
	}
	 
	class NegativeAmountException extends Exception {
	    public NegativeAmountException(String message) {
	        super(message);
	    }
	}
	 
	