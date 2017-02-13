package com.company;

/**
 * Created by Tianran on 9/17/2016.
 */
public class Arrays {

	public static void main(String[] args) {
		int[] myVariable;
		myVariable = new int[10];

		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		myIntArray[5] = 50;

		double[] myDoubleAray = new double[10];
		System.out.println(myIntArray[5]);

		for(int i = 0; i < myVariable.length; i++) {
			myVariable[i] = i * 10;
		}
		printArray(myVariable);

	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + ", value is " + array[i]);
		}
	}
}
