package com.tnsif.polymorphism;

public class MethodOverloadingDemo {
	
	//same method with different paratemeters
		int addition(int a, int b)
		{
			return a + b;
		}
		
		float addition(float a, float b)
		{
			return a + b;
		}

	public static void main(String[] args) {
		
        MethodOverloadingDemo mod = new MethodOverloadingDemo();
		
		System.out.println("Addtion is: "+mod.addition(55, 100));
		System.out.println("Addtion is: "+mod.addition(6.5f, 9.0f));
		
	}

}
