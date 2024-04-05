package com.learning.core.day1session1;
import java.util.Scanner;
		 public class DO1P32 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the day number of the week: ");
		        int dayNumber = scanner.nextInt();
		 
		        if (dayNumber >= 1 && dayNumber <= 7) {
		            String weekday;
		            if (dayNumber == 1) {
		                weekday = "Monday";
		            } else if (dayNumber == 2) {
		                weekday = "Tuesday";
		            } else if (dayNumber == 3) {
		                weekday = "Wednesday";
		            } else if (dayNumber == 4) {
		                weekday = "Thursday";
		            } else if (dayNumber == 5) {
		                weekday = "Friday";
		            } else if (dayNumber == 6) {
		                weekday = "Saturday";
		            } else {
		                weekday = "Sunday";
		            }
		            System.out.println(weekday);
		        } else {
		            System.out.println("Invalid input");
		        }
		    }
		}
	
		// TODO Auto-generated method stub

	
