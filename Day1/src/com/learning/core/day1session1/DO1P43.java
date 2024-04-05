package com.learning.core.day1session1;
import java.util.Scanner;

public class DO1P43 {
    public static int[] readArray() {
Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
 
    public static void findIndexOfRepeatingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        int[] arr = readArray();
        findIndexOfRepeatingElement(arr);
    }
}
