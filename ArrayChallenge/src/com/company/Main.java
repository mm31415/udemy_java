package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int[] numbers = getInts();

    printInts(numbers);

//    int[] sorted = sortInts(numbers);
//
    printInts(sortInts(numbers));
  }

  public static int[] getInts() {
    int numLength = scanner.nextInt();
    int[] numbers = new int[numLength];

    for (int i = 0; i < numLength; i++) {
      numbers[i] = scanner.nextInt();
//      scanner.nextLine();
    }

    scanner.close();

    return numbers;
  }

  public static void printInts(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i + ": " + numbers[i]);
    }
  }

  public static int[] sortInts(int[] numbers) {
//    int[] result = new int[numbers.length];
//
//    for (int i = 0; i < numbers.length; i++) {
//      result[i] = numbers[i];
//    }
    int[] result = Arrays.copyOf(numbers, numbers.length);

    boolean sorted = false;
    int temp;

    while(!sorted) {
      sorted = true;
      for (int i = 0; i < result.length - 1; i++) {
        if (result[i] < result[i + 1]) {
          temp = result[i];
          result[i] = result[i + 1];
          result[i + 1] = temp;
          sorted = false;
        }
      }
    }

    return result;
  }


}
