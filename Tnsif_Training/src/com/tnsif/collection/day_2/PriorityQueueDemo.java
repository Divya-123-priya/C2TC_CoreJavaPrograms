package com.tnsif.collection.day_2;


	import java.util.Iterator;
	import java.util.PriorityQueue;
	import java.util.Queue;

	public class PriorityQueueDemo {

		public static void main(String args[]) {
			Queue<String> subjects = new PriorityQueue<>();

			subjects.add("Mathematics");
			subjects.add("Physics");
			subjects.add("Chemistry");
			subjects.add("Biology");

			System.out.println("Subjects Queue: " + subjects);
			subjects.remove("Physics");

			System.out.println("After Remove Physics: " + subjects);

			System.out.println("Poll Method returns: " + subjects.poll());

			System.out.println("Queue after poll: " + subjects);

			Iterator<String> iterator = subjects.iterator();

			System.out.print("Using Iterator: ");
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();

			// Printing the top element
			System.out.println("Peek (top element): " + subjects.peek());

			// Printing the top element and removing it
			System.out.println("Poll (remove top): " + subjects.poll());

			// Printing the top element again
			System.out.println("New top element: " + subjects.peek());
			
			System.out.println("Final Queue: " + subjects);
			subjects.clear();	
		    System.out.println("After the clear: " + subjects);	
		}

	}
