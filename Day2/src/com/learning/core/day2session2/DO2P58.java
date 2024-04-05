package com.learning.core.day2session2;
import java.util.Scanner;

public class DO2P58 {
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Input: ");
	        String input = scanner.nextLine();
	        
	        if(canSplitIntoFourDistinctStrings(input))
	            System.out.println("Output: Yes");
	        else
	            System.out.println("Output: No");
	    }
	    
	    public static boolean canSplitIntoFourDistinctStrings(String str) {
	        if(str == null || str.length() < 4)
	            return false;
	        
	        int[] count = new int[26]; // assuming only lowercase letters
	        
	        for(char c : str.toCharArray()) {
	            if(!Character.isLetter(c)) // considering only letters
	                return false;
	            count[c - 'a']++;
	        }
	        
	        int distinctCount = 0;
	        for(int i : count) {
	            if(i > 0)
	                distinctCount++;
	        }
	        
	        return distinctCount >= 4;
	    }
	}


