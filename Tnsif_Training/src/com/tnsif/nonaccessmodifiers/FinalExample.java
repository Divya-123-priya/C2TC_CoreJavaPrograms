package com.tnsif.nonaccessmodifiers;

final public class FinalExample {
	
	
	final int x = 100;
	
	final void print1() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		fe.print1();
		
		//fe.x = 200; 
		
		fe.print1();
		

	}

}

/*class Example extends FinalExample{
    void print() {
		
	}
}*/