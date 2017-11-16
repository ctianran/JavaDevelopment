package com.chentianran;

import static com.chentianran.ThreadColor.ANSI_RED;

/**
 * Created by Tianran on 11/14/2017.
 */
public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(ANSI_RED + "Hello from MyRunnable thread.");
	}
}
