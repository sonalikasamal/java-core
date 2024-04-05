package com.learning.core.day1session1;
import java.util.Scanner;

public class DO1P33 {
	 	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the marks obtained: ");
	        int marks = scanner.nextInt();
	 
	        double percentage = ((double) marks / 100) * 100; // As
	        String grade = calculateGrade(percentage);
	        System.out.println("Grade: " + grade);
	    }
	 
	    public static String calculateGrade(double percentage) {
	        if (percentage >= 60) {
	            return "A Grade";
	        } else if (percentage >= 45) {
	            return "B Grade";
	        } else if (percentage >= 35) {
	            return "C Grade";
	        } else {
	            return "Fail";
	        }
	    }
}
	
	