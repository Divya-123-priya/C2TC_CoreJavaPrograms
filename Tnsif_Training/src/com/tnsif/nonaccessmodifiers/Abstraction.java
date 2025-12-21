package com.tnsif.nonaccessmodifiers;

abstract class Vehicle{
	
	abstract void move(); //functionality or declaration

}

class Car extends Vehicle{
	
	void move() {
		System.out.println("Car is moving");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.move();		
		

	}

}