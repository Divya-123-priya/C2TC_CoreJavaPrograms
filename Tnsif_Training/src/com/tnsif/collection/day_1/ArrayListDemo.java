package com.tnsif.collection.day_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

  public static void main(String[] args) {

			List list1 = new ArrayList(); // Raw ArrayList - heterogeneous
			System.out.println("Initial Size: " + list1.size());
			System.out.println("Is empty? " + list1.isEmpty());
			
			list1.add("Java");
			list1.add(100);
			list1.add(45.67);
			list1.add(true);
			list1.add("Python");
			list1.add('C');
			list1.add(100); // duplicate
			list1.add(3.14);
			
			System.out.println("List after adding: " + list1);
			
			list1.add(2, "C++"); // add at index 2
			System.out.println("After adding at index 2: " + list1);
			
			System.out.println("Element at index 3: " + list1.get(3));
			
			list1.remove("Python");
			System.out.println("After removing 'Python': " + list1);
			
			list1.remove(4); // remove element at index 4
			System.out.println("After removing index 4: " + list1);
			
			System.out.println("Contains 100? " + list1.contains(100));
			System.out.println("Contains 'Ruby'? " + list1.contains("Ruby"));
			
			System.out.println("First index of 100: " + list1.indexOf(100));
			System.out.println("Last index of 100: " + list1.lastIndexOf(100));
			
			list1.clear();
			System.out.println("After clear: " + list1);
			
			System.out.println("\n--- Generic ArrayList ---");
			
			List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(56);
			numbers.add(23);
			numbers.add(89);
			numbers.add(12);
			numbers.add(45);
			numbers.add(67);
			
			System.out.println("Numbers: " + numbers);
			
			Collections.sort(numbers);
			System.out.println("Sorted ascending: " + numbers);
			
			Collections.reverse(numbers);
			System.out.println("Sorted descending: " + numbers);
			
			System.out.println("\n--- Iterator Demo ---");
			Iterator<Integer> itr = numbers.iterator();
			while(itr.hasNext()) {
				int num = itr.next();
				System.out.print(num + " ");
				if(num > 50) {
					itr.remove();
				}
			}
			System.out.println("\nAfter removing >50: " + numbers);
			
			System.out.println("\n--- ListIterator Backward ---");
			ListIterator<Integer> listItr = numbers.listIterator(numbers.size());
			while(listItr.hasPrevious()) {
				System.out.print(listItr.previous() + " ");
			}
			
			System.out.println("\n\n--- String List Example ---");
			
			List<String> cities = new ArrayList<String>();
			cities.add("Mumbai");
			cities.add("Delhi");
			cities.add("Chennai");
			cities.add("Kolkata");
			cities.add("Bangalore");
			cities.add("Mumbai"); // duplicate
			
			System.out.println("Cities: " + cities);
			
			cities.set(1, "New Delhi");
			System.out.println("After updating index 1: " + cities);
			
			Collections.sort(cities);
			System.out.println("Sorted cities: " + cities);
			
			System.out.println("\n--- For-each Loop ---");
			for(String city : cities) {
				System.out.println(city.toUpperCase());
			}
		}

	}
