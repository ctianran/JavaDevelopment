package com.company;

/**
 * Created by Tianran on 9/5/2016.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int myFirstNumber = 10 + 5 + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println("myFirstNumber");
        System.out.println(myTotal);
        System.out.println(myLastOne);

    }
}
