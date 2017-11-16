package com.chentianran;

import static com.chentianran.ThreadColor.ANSI_BLUE;

/**
 * Created by Tianran on 11/14/2017.
 */
public class AnotherThread extends Thread {
	@Override
	public void run() {
		System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			System.out.println(ANSI_BLUE + "Another thread woke me up");
			return;
		}
		System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake.");
	}
}
