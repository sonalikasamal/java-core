package com.learning.core.day2session2;
import java.util.*;

public class DO2P53 {
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = scanner.nextLine();
	        System.out.println("Subsequences of the string " + str + " are:");
	        printSubsequences(str);
	    }
	 
	    public static void printSubsequences(String str) {
	        int n = str.length();
	        // Total number of subsequences will be 2^n
	        int total = 1 << n;
	 
	        // Run a loop for printing all 2^n
	        // subsequences one by one
	        for (int i = 1; i < total; i++) {
	            StringBuilder sb = new StringBuilder();
	            for (int j = 0; j < n; j++) {
	                // Check if jth bit in the binary representation of i is set
	                // If it is set, print jth character from the input string
	                if ((i & (1 << j)) > 0) {
	                    sb.append(str.charAt(j));
	                }
	            }
	            // Print the subsequence
	            System.out.print(sb.toString() + ", ");
	        }
	    }
	}
	


