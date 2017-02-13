package com.company;

/**
 * Created by Tianran on 10/3/2016.
 */
public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am not good at that.");
	}
}
