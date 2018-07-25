package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;

        while (count != 5) {
            System.out.println(count);
            count++;
        }


        do {
            System.out.println(count);
            count++;
        } while (count < 6);

        int number = 4;
        int finishNum = 20;

        while (number <= finishNum) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println(number);
        }
    }

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
