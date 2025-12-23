package com.tnsif.introofexceptionhandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		int score;
		try {

			score = TryCatchExample.performDivision(25, 0);
			if (score != 0)
				System.out.println("Divisin of this  " + score);

			System.out.println("------------------------------");

			score = TryCatchExample.performDivision(953, 7);
			if (score != 0)
				System.out.println("Division of this " + score);

			System.out.println("------------------------------");
		} catch (Exception e) {
			System.out.println("I am in catch block: " + e.getMessage());
			
			e.printStackTrace();
		}
		System.out.println(TryCatchExample.performDivision(345f, 8f));

		System.out.println("------------------------------");
		System.out.println(TryCatchExample.performDivision(98f, 0f));

	}

}
