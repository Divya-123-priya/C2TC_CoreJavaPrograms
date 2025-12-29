package com.tnsif.multithreading.threadclass;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(6, "First");
		ChildThread threadTwo = new ChildThread(12, "Second");

		threadOne.start();
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
	

}
