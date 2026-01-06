package com.tnsif.collection.day_1;

	import java.util.Iterator;
	import java.util.Vector;

	public class VectorDemo {

		public static void main(String[] args) {
			Vector<Integer> numbers = new Vector<>();
			numbers.add(100);
			numbers.add(200);
			numbers.add(300);
			numbers.add(400);
			numbers.add(500);

			System.out.println("Numbers Vector: " + numbers);
			
			// Using get()
			int element = numbers.get(0);
			System.out.println("Element at index 0: " + element);
			
			System.out.println("Element at index 4: " + numbers.get(4));

			// Using iterator()
			Iterator<Integer> iterate = numbers.iterator();
			System.out.print("Vector: ");
			while (iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(" ");
			}
			System.out.println();
			
			// Using remove()
			element = numbers.remove(1);
			System.out.println("Removed Element: " + element);
			System.out.println("Vector after removal: " + numbers);
			
			element = numbers.remove(2);
			System.out.println("Removed Element: " + element);
			System.out.println("Vector after second removal: " + numbers);

			// Using clear()
			numbers.clear();
			System.out.println("Vector after clear(): " + numbers);
			
			System.out.println("Size of vector: " + numbers.size());
		}

	}
	

