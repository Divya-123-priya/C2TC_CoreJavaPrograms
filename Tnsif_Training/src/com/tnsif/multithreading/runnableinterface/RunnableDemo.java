package com.tnsif.multithreading.runnableinterface;

public class RunnableDemo {

	public static void main(String[] args) {
UsingRunnable obj = new UsingRunnable(11, 20, "Hello Girl!!");
		

		Runnable runnable = new Runnable() {
			@Override
			public void run() { 
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		runnable = () -> { 
			System.out.println("Runnable with Lambda Expression");
		};
		
		new Thread(runnable).start();

		System.out.println("-------------------------------------------------------");
		int n=3;
		runnable = () -> {
			try {
				for (int i = 1; i <= n; i++) {
					System.out.println("Loop iteration: " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.err.println("The Task is interrupted.");
			}
		};

		
		new Thread(runnable).start();
		
	}

}
