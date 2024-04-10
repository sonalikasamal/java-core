package com.learning.core.day4session1;

//public class D04P91 {

public class D04P91 {
    private int maxSize;
    private String[] stackArray;
    private int top;
 
    public D04P91(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }
 
    public void push(String item) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackArray[top] = item;
    }
 
    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        String poppedItem = stackArray[top];
        top--;
        return poppedItem;
    }
 
    public static void main(String[] args) {
        D04P91 stack = new D04P91(5);
 
        // Pushing elements onto the stack
        String[] elements = {"Hello", "world", "java", "Programming"};
        for (String element : elements) {
            stack.push(element);
        }
 
        System.out.print("After Pushing 4 Elements: ");
        for (int i = 0; i <= stack.top; i++) {
            System.out.print(stack.stackArray[i] + " ");
        }
        System.out.println();
 
        // Popping an element from the stack
        String poppedItem = stack.pop();
        System.out.print("After a Pop: ");
        for (int i = 0; i <= stack.top; i++) {
            System.out.print(stack.stackArray[i] + " ");
        }
    }
}