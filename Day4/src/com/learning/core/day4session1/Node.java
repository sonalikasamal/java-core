package com.learning.core.day4session1;
class Node{
    double data;
    Node next;
 
    Node(double data) {
        this.data = data;
        this.next = null;
    }
}
 
class Stack {
    private Node top;
 
    Stack() {
this.top = null;
    }
 
    void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
 
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Popped element: " + top.data);
        top = top.next;
    }
 
    void display() {
        Node temp = top;
        System.out.print("Elements in stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
 
class Queue {
    private Node front;
    private Node rear;
 
    Queue() {
        this.front = null;
        this.rear = null;
    }
 
    void enqueue(double data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
 
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Removed element: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
 
    void display() {
        Node temp = front;
        System.out.print("Elements in queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}