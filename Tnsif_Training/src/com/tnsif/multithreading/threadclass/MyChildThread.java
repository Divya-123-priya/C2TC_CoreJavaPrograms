package com.tnsif.multithreading.threadclass;

public class MyChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no < 6) {
			no++;
			System.out.println("number = " + no);
			try {
				sleep(600);

			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}
}
