package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore("Johnny", 49);

        calculateScore(55);

        double result1 = ftInToCm(6, 0);
        double result2 = ftInToCm(100);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static void calculateScore(String name, int score) {
        System.out.println(name + " scored " + score);
    }

    public static void calculateScore(int score) {
        System.out.println("Unamed scored " + score);
    }

    public static double ftInToCm(int feet, int inches) {
        if(feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (feet * 12 * 2.54) + (inches * 2.54);
        }
        return -1;
    }

    public static double ftInToCm(int inches) {
        if(inches >= 0) {
            return ftInToCm(inches / 12, inches % 12);
        }
        return -1;
    }
}
