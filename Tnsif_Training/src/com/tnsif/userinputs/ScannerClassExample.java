package com.tnsif.userinputs;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Roll No: ");
		int rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your Name: ");
		String na = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Enter your Department: ");
		String dept = sc.nextLine();
		    
		System.out.println("The Roll No is: " + rno);
		
		System.out.println("The Name is: " + na);
		
		System.out.println("The Dept is: " + dept);
		
		
		
	}

}
