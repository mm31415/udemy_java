package com.company;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int myValue = 10;
    int anotherValue = myValue;

    System.out.println("myValue: " + myValue);
    System.out.println("anotherValue: " + anotherValue);

    myValue--;
    anotherValue++;

    System.out.println("myValue: " + myValue);
    System.out.println("anotherValue: " + anotherValue);

    int[] myIntArr = new int[5];
    int[] anotherArr = myIntArr;

    System.out.println("myIntArr: " + Arrays.toString(myIntArr));
    System.out.println("anotherArr: " + Arrays.toString(anotherArr));

    myIntArr[2] = 4;
    anotherArr[0] = 1;

    System.out.println("myIntArr: " + Arrays.toString(myIntArr));
    System.out.println("anotherArr: " + Arrays.toString(anotherArr));

    modifyArray(anotherArr);

    System.out.println("myIntArr: " + Arrays.toString(myIntArr));
    System.out.println("anotherArr: " + Arrays.toString(anotherArr));

    myIntArr = new int[] { 4,5,6,7,8 };

    System.out.println("myIntArr dereferenced: " + Arrays.toString(myIntArr));
    System.out.println("anotherArr: " + Arrays.toString(anotherArr));

  }

  private static void modifyArray(int[] array) {
    array[0] = 2;

    array = new int[] { 1, 2, 3, 4, 5 };
    System.out.println("dereferenced: " + Arrays.toString(array));
  }
}
