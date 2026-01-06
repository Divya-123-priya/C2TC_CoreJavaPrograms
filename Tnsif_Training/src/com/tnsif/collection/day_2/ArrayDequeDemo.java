package com.tnsif.collection.day_2;

	import java.util.ArrayDeque;
	import java.util.Deque;
	import java.util.Iterator;

	public class ArrayDequeDemo {

		public static void main(String[] args) {
			Deque<String> cities = new ArrayDeque<String>();
			cities.add("Mumbai");
			cities.add("Delhi");
			cities.add("Chennai");

			// offerFirst-adds elements at the front
			cities.offer("Kolkata");

			cities.offerFirst("Bangalore");
			// offerLast inserts the element at the last
			cities.offerLast("Hyderabad");

			Iterator<String> itr = cities.iterator();
			System.out.println("Cities in ArrayDeque:");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("\nAfter poll");
			String s = cities.poll();
			System.out.println("Poll Item is: " + s);

			System.out.println("\nRemaining cities:");
			for (String item : cities) {
				System.out.println(item);
			}
		}
	}

