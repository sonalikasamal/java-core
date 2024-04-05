package com.learning.core.day2session2;
import java.util.Scanner;
public class DO2P51 {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Take input from the user
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Display the length of the string
	        //System.out.println("Length of the string: " + inputString.length());
	        
	        // Display the string in uppercase
	       // String uppercaseString = inputString.toUpperCase();
	        //System.out.println("Uppercase string: " + uppercaseString);
	        
	        // Check if the string is a palindrome
	        if (isPalindrome(inputString)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome.");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to check if a string is a palindrome
	    public static boolean isPalindrome(String s) {
	        int i = 0, j = s.length() - 1;
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	}
	