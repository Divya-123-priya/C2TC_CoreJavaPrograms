package com.tnsif.collection.day_2;


	import java.util.LinkedList;
	import java.util.Queue;

	public class QueueDemo {
	    public static void main(String[] args) {
	        Queue<Integer> numbers = new LinkedList<>();
	        
	        // Add elements 10, 20, 30, 40, 50
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        
	        System.out.println("Queue: " + numbers);
	        
	        // Remove head of queue
	        int removedNum = numbers.remove();
	        System.out.println("Removed: " + removedNum);
	        System.out.println("Queue after remove: " + numbers);
	        
	        // Peek at head
	        int head = numbers.peek();
	        System.out.println("Head of queue: " + head);
	        
	        // Size
	        System.out.println("Queue size: " + numbers.size());
	        
	        // Remove another element
	        removedNum = numbers.remove();
	        System.out.println("Removed another: " + removedNum);
	        System.out.println("Queue now: " + numbers);
	        
	        // Check if empty
	        System.out.println("Is queue empty? " + numbers.isEmpty());
	        
	        // Peek again
	        System.out.println("Current head: " + numbers.peek());
	    }
	}

