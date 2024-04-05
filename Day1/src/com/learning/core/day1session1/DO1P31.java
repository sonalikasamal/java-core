package com.learning.core.day1session1;
import java.util.Scanner;

public class DO1P31 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();
        
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Invalid Input");
        }
        
        scanner.close();
    }
}

		