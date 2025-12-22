package com.tnsif.interfacedemo;

public class GreetingExecutor {
	
	public static void main(String[] args) {
		
		GreetingDemo gd = () -> {
			System.out.println("Hello All! Welcome you  ");
		};
		
		gd.greet();
	}
 

}
