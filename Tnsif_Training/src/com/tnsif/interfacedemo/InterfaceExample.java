package com.tnsif.interfacedemo;

interface Vehicle{
	void speed();
}

public class InterfaceExample implements Vehicle{
	
	public void speed() {
		System.out.println("The Vehicle are always speed");
		
	}

	public static void main(String[] args) {
		
		InterfaceExample ie = new InterfaceExample();
		ie.speed();
		
	}

}
