package com.learning.core.day1session1;
import java.util.Scanner;


public class DO1P34{
	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }
	}