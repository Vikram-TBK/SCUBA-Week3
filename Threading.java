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
		}
		System.out.println("End time  " + new Date());

	}

}

public class Threading {
	public static void main(String[] args) {
		System.out.println("Time to start: " + new Date());
		int n = 20;
		for (int i = 1; i < n; i++) {
			Threading T = new Threading();
			T.toString();
		}

	}

}
