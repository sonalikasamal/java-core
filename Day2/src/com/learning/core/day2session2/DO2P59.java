package com.learning.core.day2session2;

public class DO2P59 {
	
	
	    public static void main(String[] args) {
	        String input = "Mr John Smith";
	        String output = replaceSpaces(input);
	        System.out.println(output);
	    }
	    
	    public static String replaceSpaces(String input) {
	        return input.replaceAll(" ", "%20");
	    }
	}


