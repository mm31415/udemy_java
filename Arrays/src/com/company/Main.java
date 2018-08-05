package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println(getAverage(myIntegers));
	// write your code here
//        int[] myArray;
//        myArray = new int[10];
//        int[] myIntArray = new int[10]; //makes array of length 10
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[5]);
//
//        int[] secondIntArr = { 1,2,3,4,5 }; // [1,2,3,4,5]
//        System.out.println(secondIntArr[2]);
//
//        int[] thirdIntArr = new int[10];
//        for (int i = 0; i < thirdIntArr.length; i++) {
//            thirdIntArr[i] = i * 10;
//        }
//
////        for (int i = 0; i < thirdIntArr.length; i++) {
////            System.out.println(i + " * 10 = " + thirdIntArr[i]);
////        }
//        printArray(thirdIntArr);
//
//        double[] myDoubleArray = new double[10];

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            if (scanner.hasNextInt()) {
                values[i] = scanner.nextInt() * 10;
            } else {
                i--;
            }
//            scanner.nextLine();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i] / 10) + " * 10 = " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
