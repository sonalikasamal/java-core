package com.learning.core.day4session1;


	public class DO4P94 {
	    private int capacity;
	    private int[] queue;
	    private int front;
	    private int rear;
	    private int size;
	 
	    public DO4P94(int capacity) {
	        this.capacity = capacity;
	        this.queue = new int[capacity];
	        this.front = 0;
	        this.rear = -1;
	        this.size = 0;
	    }
	 
	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full");
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queue[rear] = item;
	        size++;
	    }
	 
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int item = queue[front];
	        front = (front + 1) % capacity;
	        size--;
	        return item;
	    }
	 
	    public boolean isEmpty() {
	        return size == 0;
	    }
	 
	    public boolean isFull() {
	        return size == capacity;
	    }
	 
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Elements in queue: ");
	        int count = 0;
	        int i = front;
	        while (count < size) {
	            System.out.print(queue[i] + " ");
	            i = (i + 1) % capacity;
	            count++;
	        }
	        System.out.println();
	    }
	 
	    public static void main(String[] args) {
	        DO4P94 queue = new DO4P94(4);
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.display();
	 
	        queue.dequeue();
	        queue.display();
	    }
	}

