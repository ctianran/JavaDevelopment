package com.company;

/**
 * Created by Tianran on 9/9/2016.
 */
public class Classes {
	public static void main(String[] args){
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("commodore");
		System.out.println("Model is " + porsche.getModel());
	}
}
