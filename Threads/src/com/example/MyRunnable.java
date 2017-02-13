package com.example;

import static com.example.ThreadColor.ANSI_RED;

/**
 * Created by Tianran on 11/10/2016.
 */
public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
	}
}
