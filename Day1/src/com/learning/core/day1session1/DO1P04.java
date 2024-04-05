package com.learning.core.day1session1;
import java.util.Scanner;

public class DO1P04 {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	 
	        // Input two numbers
	        System.out.println("Enter two numbers in the range from 1 to 40:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	 
	        // Input the array
	        System.out.println("Enter five integers separated by spaces:");
	        int[] array = new int[5];
	        for (int i = 0; i < 5; i++) {
	            array[i] = scanner.nextInt();
	        }
	 
	        // Check if both numbers are found in the array
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i : array) {
	            if (i == num1) {
	                foundNum1 = true;
	            }
	            if (i == num2) {
	                foundNum2 = true;
	            }
	        }
	 
	        // Output the result
	        if (foundNum1 && foundNum2) {
	            System.out.println("It's Bingo");
	        } else {
	            System.out.println("not found");
	        }
	    }
	    
}
	
	