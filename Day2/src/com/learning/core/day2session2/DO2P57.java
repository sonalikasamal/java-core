package com.learning.core.day2session2;
import java.util.regex.*;
import java.util.*;

public class DO2P57 {
	
	    public static void main(String[] args) {
	        String input = "abb abc xyz\n" +
	                        "xyy\n" +
	                        "foo";
	        String pattern = "\\b[a-z]{3}\\b"; // Change the pattern according to your requirements
	        
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(input);
	        Map<String, Integer> counts = new HashMap<>();
	 
	        while (m.find()) {
	String match = m.group();
	            counts.put(match, counts.getOrDefault(match, 0) + 1);
	        }
	 
	        List<String> result = new ArrayList<>();
	        for (String key : counts.keySet()) {
	            if (counts.get(key) > 1) {
	                result.add(key);
	            }
	        }
	 
	        System.out.println(String.join(" ", result));
	    }
	}
