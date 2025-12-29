package com.tnsif.multithreading.threadclass;

public class ThreadMethodsDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(6, "First"); 
		ChildThread threadTwo = new ChildThread(12, "Second"); 
		System.out.println("Current Thread: " + Thread.currentThread());

		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread"); 
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			threadOne.join(); 
			threadTwo.join(900); 
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}
	

}
