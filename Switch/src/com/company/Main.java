package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;

        if(value == 1) {
            System.out.println("Value is 1");
        } else if(value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3,4, or 5");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }

        char valueChar = 'D';

        switch(valueChar) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("Was char of a, b, or c");
                break;
            default:
                System.out.println("Was char of " + valueChar);
                break;
        }
    }
}
