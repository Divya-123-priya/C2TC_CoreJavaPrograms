package com.tnsif.oopsconcept;

public class Executor {

	public static void main(String[] args) {
		EncapsulationDemo ED = new EncapsulationDemo();
		ED.setName("M S Dhoni");
		ED.setAge(44);
		ED.setJersyNo(7);
		ED.setHeight(1.75);
		
		System.out.println(ED);
		
		ED.setName("jadeja");
		ED.setAge(37);
		ED.setJersyNo(8);
		ED.setHeight(1.73);
		
		System.out.println(ED);
		
		ED.setName("sanju samson");
		ED.setAge(31);
		ED.setJersyNo(11);
		ED.setHeight(1.7);
		
		System.out.println(ED);
		
		
		Executor e = new Executor();
		System.out.println(e);

	}

}
