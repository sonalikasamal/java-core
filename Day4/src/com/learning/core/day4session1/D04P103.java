package com.learning.core.day4session1;



	import java.util.Scanner;
	 
	public class D04P103 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number of elements in the array:");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Enter the element to search:");
	        int target = scanner.nextInt();
	        
	        boolean found = linearSearch(array, target);
	        
	        if (found) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean linearSearch(int[] array, int target) {
	        for (int num : array) {
	            if (num == target) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

