package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));  //Autoboxing
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());  //Autounboxing
        }

        Integer myIntValue = 56;  //Integer.valueOf(56);
        int myInt = myIntValue;  //myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));  // == myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // == myDoubleValues.get(i)
            System.out.println(i + " --> " + value);
        }

    }
}
