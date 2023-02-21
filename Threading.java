package Assign;

import java.util.Date;

class Multithreading extends Thread {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + "Is Running");
			Thread.currentThread();
			Thread.sleep(7000);

			System.out.println("Thread " + Thread.currentThread().getId() + "Is Completed  ");

		} catch (Exception e) {
			System.out.println("Exception");
			Thread.sleep(5000);
		}
		System.out.println("End time  " + new Date());
		Thread.sleep(8000);

	}

}

public class Threading {
	public static void main(String[] args) {
		System.out.println("Time to start: " + new Date());
		int n = 15;
		for (int i = 1; i < n; i++) {
			Threading T = new Threading();
			Thread.sleep(4000);
			T.toString();
		}

	}

}
