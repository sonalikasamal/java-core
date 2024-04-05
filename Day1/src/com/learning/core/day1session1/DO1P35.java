package com.learning.core.day1session1;
import java.util.Scanner;


public class DO1P35 {

	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is " + factorial);
	    }
	 
	    public static int calculateFactorial(int n) {
	        if (n == 0)
	            return 1;
	        else
	            return n * calculateFactorial(n - 1);
	    }
}