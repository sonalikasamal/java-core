package com.learning.core.day4session1;


public class DO4P92 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String input = "10.0 20.0 30.0 40.0";
        String[] elements = input.split(" ");
        for (String element : elements) {
            stack.push(Double.parseDouble(element));
        }
        
        stack.display();
        
        stack.pop();
        stack.pop();
        
        System.out.print("After popping twice: ");
        stack.display();
    }
}

