package com.learning.core.day3session3;
import java.util.ArrayList;
import java.util.Scanner;
 
public class DO3P71 {
	
	    public static void main(String[] args) {
	        // Create an ArrayList to store student names
	        ArrayList<String> studentNames = new ArrayList<>();
	 
	        // Add student names to the ArrayList
	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the list of student names separated by spaces:");
	        String inputNames = scanner.nextLine();
	        String[] namesArray = inputNames.split(" ");
	        for (String name : namesArray) {
	            studentNames.add(name);
	        }
	 
	        // Prompt for the name to search
	        System.out.println("Enter the name to search:");
	        String searchName = scanner.nextLine();
	 
	        // Check if the name exists in the list
	        if (studentNames.contains(searchName)) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not found");
	        }
	    }
	}


