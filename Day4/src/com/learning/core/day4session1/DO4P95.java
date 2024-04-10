package com.learning.core.day4session1;


	
	public class DO4P95 {
	    public static void main(String[] args) {
	        Queue queue = new Queue();
	 
	        // Add elements to the queue
	        queue.enqueue(89);
	        queue.enqueue(99);
	        queue.enqueue(109);
	        queue.enqueue(209);
	        queue.enqueue(309);
	 
	        // Display elements in the queue
	        System.out.print("Elements in queue: ");
	        queue.display();
	 
	        // Remove two elements
	        queue.dequeue();
	        queue.dequeue();
	 
	        // Display elements after removing two elements
	        System.out.print("After removing two elements: ");
	        queue.display();
	    }
	}
	


