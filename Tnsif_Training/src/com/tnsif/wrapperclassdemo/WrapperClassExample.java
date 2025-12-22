package com.tnsif.wrapperclassdemo;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		int y = 100;
		int n = 200;
		
		Integer z = Integer.valueOf(y);
		Integer o = Integer.valueOf(n);
		
		System.out.println(z);
		System.out.println(o);
		
		
		int m = z;
		System.out.println(m);
	}

}
