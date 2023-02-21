package Assign;

import java.util.Date;

class Multithreading extends Thread {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + "Is Running");
			Thread.currentThread();
			Thread.sleep(5000);

			System.out.println("Thread " + Thread.currentThread().getId() + "Is Completed  ");

		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("End time  " + new Date());

	}

}

public class Threading {
	public static void main(String[] args) {
		System.out.println("Start time: " + new Date());
		int n = 7;
		for (int i = 0; i < n; i++) {
			Threading T = new Threading();
			T.toString();
		}

	}

}
