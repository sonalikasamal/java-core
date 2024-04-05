package com.learning.core.day2session2;
import java.util.*;

public class DO2P55 {
	
	    public static String canFormCircle(String[] strings) {
	        Map<Character, Integer> degree = new HashMap<>();
	        for (String str : strings) {
	            char start = str.charAt(0);
	            char end = str.charAt(str.length() - 1);
	            degree.put(start, degree.getOrDefault(start, 0) + 1);
	            degree.put(end, degree.getOrDefault(end, 0) - 1);
	        }
	        for (int d : degree.values()) {
	            if (d != 0) return "No";
	        }
	        return "Yes";
	    }
	 
	    public static void main(String[] args) {
	    	int input= 5;
	        String input1 = "abc efg cde ghi ija";
	        String input2 = "Ijk kji abc cba";
	        
	        
	      
	        		String[] strings1 = input1.split("\\s");
	        String[] strings2 = input2.split("\\s");
	 
	        System.out.println(canFormCircle(strings1));
	        System.out.println(canFormCircle(strings2));
	    }
	}

