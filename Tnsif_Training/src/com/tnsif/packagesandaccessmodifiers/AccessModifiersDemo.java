package com.tnsif.packagesandaccessmodifiers;

public class AccessModifiersDemo {
	public int publicVar = 200;
	protected int protectedvar = 250;
	private int privateVar = 500;
	int defaultvar = 1000;
	
	public	void showDetails() {
		System.out.println("Public Variable: "+publicVar);
		System.out.println("Protected Variable: "+protectedvar);
		System.out.println("Private Variable: "+privateVar);
		System.out.println("Default Variable: "+defaultvar);
	}

	public static void main(String[] args) {
		
		AccessModifiersDemo amd = new AccessModifiersDemo();
		amd.showDetails();
	
	}

}
