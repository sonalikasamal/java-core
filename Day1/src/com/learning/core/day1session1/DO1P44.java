package com.learning.core.day1session1;

 public class DO1P44 {
	 public static void combinations(int[] arr, int k) {
	        int[] combination = new int[k];
	        backtrack(arr, k, 0, combination, 0);
	    }
	 
	    private static void backtrack(int[] arr, int k, int start, int[] combination, int index) {
	        if (index == k) {
	            for (int num : combination) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	            return;
	        }
	        for (int i = start; i < arr.length; i++) {
	            combination[index] = arr[i];
	            backtrack(arr, k, i + 1, combination, index + 1);
	        }
	    }
	 
	    public static void main(String[] args) {
	        int[] inputArray = {1, 2, 3};
	        int k = 2;
	        combinations(inputArray, k);
	    }
	}
