package com.learning.core.day4session1;


	import java.util.Scanner;
	 
	public class D04P101 {
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
	    
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }
	    
	    public static void printSortedArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        scanner.close();
	        
	        quickSort(arr, 0, n - 1);
	        printSortedArray(arr);
	    }
	}
