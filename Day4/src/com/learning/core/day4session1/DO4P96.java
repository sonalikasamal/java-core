package com.learning.core.day4session1;

public class DO4P96 {
    private int[] queue;
    private int front, rear, size;
 
    public DO4P96(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
 
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            queue[rear] = data;
        }
    }
 
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int removedItem = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return removedItem;
        }
    }
 
    public void display() {
        if (front == -1)
            System.out.println("Queue is empty!");
        else {
            System.out.print("Elements in circular queue: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        DO4P96 cq = new DO4P96(5);
        cq.enqueue(14);
        cq.enqueue(13);
        cq.enqueue(22);
        cq.enqueue(-8);
        cq.display();
 
        // Removing the first element
        cq.dequeue();
        cq.display();
 
        // Adding a new element
        cq.enqueue(18);
        cq.display();
 
        // Adding another new element
        cq.enqueue(42);
        cq.display();
    }
}