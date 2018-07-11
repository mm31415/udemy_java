package com.company;

public class Main {

    public static void main(String[] args) {

        // char has width of 16 (2 bytes)
        char myChar = 'p';
        char myChar2 = '\u00A9';

        System.out.println("Unicode output was: " + myChar2);

        // boolean width is
        boolean myBoolean = true;

        System.out.println('\u00AE');
    }
}
