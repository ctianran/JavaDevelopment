package com.company;

/**
 * Created by Tianran on 9/5/2016.
 *
 *  8 primitive Data Types
 *      byte
 *      short
 *      int
 *      long
 *      float
 *      double
 *      char
 *      boolean
 *
 */
public class PrimitiveDataTypes {
    public static void main(String[] args){

        /*
          **************************
            int, byte, short, long
          **************************
         */
        //int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myByteValue = -128;   // byte ranging from -1 28 to 127
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        long myLongValue = -9_223_372_036_854_775_807L;


        //1.Create a byte variable and set it any valid byte number
        byte myByte = 10;
        //2.Create a short variable and set it to any valid shrot number
        short myShort = 20;
        //3. Cteate a int variable and set it to any valid int number.
        int myInt = 50;
        //4. Create a variable of type long, and make it
        //   equal to 50000 + 10 time the sum of the byte, plus the short plus the int

        long longTotal = 50000L + 10L * (myByte + myShort + myInt);  //no need to cast
        short shortTotal = (short) (1000 + 10* (myByte + myShort + myInt));
        System.out.println("longTotal: = " + longTotal);
        System.out.println("shortTotal: = " + shortTotal);
        System.out.println();
        System.out.println();

        /*
         **********************
            float and double
         **********************
         */

        //width of int = 32 (4 bytes)
        int myIntValue = 5/2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 2f;
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        //2. Calculate the number of kilograms for the number above and store in a variable.
        //3. Print out the result.
        //NOTES: 1 pond is equal to 0.45359237 kilograms


        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        System.out.println();
        System.out.println();


        /*
         **********************
            char , boolean
         **********************
         */
        //width of 16(2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = true;


        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol  = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);
        System.out.println();
        System.out.println();

    }
}
