package com.learning.core.day1session1;

public class DO1P42 {

	public static void main(String[] args) {
        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
 
        // A. Compute the sum of elements from index 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;
 
        // B. Compute the average of all numbers and store it at element 16
        double average = (double) sum / A.length;
        A[16] = (int) Math.round(average);
 
        // C. Identify the smallest value from the array and store it at element 17
        int smallest = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;
 
        // Output the updated array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}