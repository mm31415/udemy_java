package com.company;

public class Main {

    public static void main(String[] args) {

//    	// int has a width of 32 or 2^31
//	    int myMinValue = -2_147_483_648;
//	    int myMaxValue = 2_147_483_647;
//
//	    int myTotal =  (myMinValue / 2);
//	    System.out.println("myTotal = " + myTotal);
//
//	    // short has a width of 16
//        short myMinShortValue = -32768;
//        short myMaxShortValue = 32767;
//
//        short myShortTotal = (short) (myMaxShortValue / 2);
//        System.out.println("myShortTotal = " + myShortTotal);
//
//	    // byte has a width of 8
//	    byte myMinByteValue = -128;
//	    byte myMaxByteValue = 127;
//
//	    byte myByteTotal = (byte) (myMinByteValue / 2);
//
//	    System.out.println("myByteTotal = " + myByteTotal);
//
//
//	    // long has a width of 64 or 2^63
//	    long myLongValue = -100L;

        byte val1 = 126;
        short val2 = 12344;
        int val3 = 21345322;
        long val4 = 50000L + 10L * (val1 + val2 + val3);
        short val5 = (short) (1000 + 2 * (val1 + val2));

        System.out.println("val5 = " + val5);
        System.out.println("val4 = " + val4);










    }
}
