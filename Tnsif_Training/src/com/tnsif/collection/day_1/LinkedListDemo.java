package com.tnsif.collection.day_1;

	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.ListIterator;

	public class LinkedListDemo {

		public static void main(String[] args) {
			// Create LinkedList of names
			LinkedList<String> names = new LinkedList<String>();
			
			// Add elements using different methods
			names.add("Rahul");
			names.add("Priya");
			names.add("Amit");
			names.addFirst("Zoya");      // Add at beginning
			names.addLast("Vikram");     // Add at end
			names.add(2, "Sneha");       // Add at specific position
			names.add("Rahul");          // Duplicate allowed
			
			System.out.println("Names List: " + names);
			System.out.println("Size: " + names.size());
			
			// Access first and last elements
			System.out.println("First Name: " + names.getFirst());
			System.out.println("Last Name: " + names.getLast());
			
			// Remove elements
			names.removeFirst();
			names.removeLast();
			names.remove("Rahul");       // Remove first occurrence
			
			System.out.println("After removing first, last and 'Rahul': " + names);
			
			// Check if contains
			System.out.println("Contains 'Amit'? " + names.contains("Amit"));
			System.out.println("Contains 'Rahul'? " + names.contains("Rahul"));
			
			// Get index
			System.out.println("Index of 'Sneha': " + names.indexOf("Sneha"));
			
			System.out.println("\n--- Forward Iteration ---");
			ListIterator<String> iterator = names.listIterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.print(name + " -> ");
				if (name.equals("Amit")) {
					iterator.add("Amit's Friend");
				}
			}
			
			System.out.println("\nList after forward iteration: " + names);
			
			System.out.println("\n--- Backward Iteration with Modification ---");
			iterator = names.listIterator(names.size());
			while (iterator.hasPrevious()) {
				String name = iterator.previous();
				System.out.print(name + " <- ");
				
				if (name.equals("Priya")) {
					iterator.set("Priya Sharma");
				}
				if (name.equals("Sneha")) {
					iterator.remove();
				}
			}
			
			System.out.println("\nList after backward iteration: " + names);
			
			// Sort the list
			Collections.sort(names);
			System.out.println("\nSorted in Ascending order: " + names);
			
			Collections.reverse(names);
			System.out.println("Sorted in Descending order: " + names);
		
		}
	}

