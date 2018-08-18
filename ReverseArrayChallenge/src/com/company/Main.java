package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int times = scanner.nextInt();
    scanner.nextLine();

    int[] array = new int[times];

    for (int i = 0; i < times; i ++) {
      array[i] = scanner.nextInt();
      scanner.nextLine();
    }

    System.out.println("Normal: " + Arrays.toString(array));

    reverse(array);

    System.out.println("Reversed: " + Arrays.toString(array));


  }

  public static void reverse(int[] array) {
    int i = 0;
    int j = array.length - 1;
    int temp;

    while (i < j) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;

      i++;
      j--;
    }
  }

}
