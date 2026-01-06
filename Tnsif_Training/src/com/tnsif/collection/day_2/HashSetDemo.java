package com.tnsif.collection.day_2;

	import java.util.HashSet;
	import java.util.Spliterator;

	public class HashSetDemo {
		static void addElements(HashSet<String> countrySet) {
			countrySet.add("India");
			countrySet.add("USA");
			countrySet.add("UK");
			countrySet.add("Japan");
			countrySet.add("Germany");
			countrySet.add("France");
			countrySet.add("Australia");
			System.out.println("Add duplicate 'India': " + countrySet.add("India")); //returns false
		}

		public static void main(String[] args) {
			//Unordered and unsorted set
			HashSet<String> countrySet = new HashSet<String>();
			addElements(countrySet);

			HashSet<String> countrySet1 = new HashSet<String>();
			countrySet1.add("India");
			countrySet1.add("USA");
			countrySet1.add("Canada");
			countrySet1.add("Russia");
			countrySet1.add("China");
			countrySet1.add("Japan");
			countrySet1.add("Brazil");

			System.out.println("Set 1: " + countrySet);
			System.out.println("Set 2: " + countrySet1);

			HashSet<String> countrySet2 = new HashSet<String>();
			addElements(countrySet2);

			// Union of two sets
			countrySet2.addAll(countrySet1);
			System.out.println("Union of Set 1 and Set 2: " + countrySet2);

			countrySet2.clear();
			addElements(countrySet2);
			// Intersection of two SETs
			countrySet2.retainAll(countrySet1);
			System.out.println("Intersection of Set 1 and Set 2: " + countrySet2);

			countrySet2.clear();
			addElements(countrySet2);
			// SET Difference
			countrySet2.removeAll(countrySet1);
			System.out.println("Set Difference (Set 1 - Set 2): " + countrySet2);

			//SplitIterator 
			Spliterator<String> split = countrySet.spliterator();
			System.out.print("Spliterator elements: ");
			split.forEachRemaining(n -> System.out.print(n + " "));
		}

	}