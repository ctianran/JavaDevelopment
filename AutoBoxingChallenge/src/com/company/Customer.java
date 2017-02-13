package com.company;

import java.util.ArrayList;

/**
 * Created by Tianran on 9/25/2016.
 */
public class Customer {
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}


}
