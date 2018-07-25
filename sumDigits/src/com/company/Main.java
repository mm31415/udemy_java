package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int changeNumber = number;

        int sum = 0;
        while(changeNumber != 0) {
            sum += changeNumber % 10;
            changeNumber /= 10;
        }

        return sum;
    }
}
