package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        //result = result + 1;
        //result += 1;
        result++;
        System.out.println(previousResult + " + 1 = " + result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 99;
        if (topScore != 100) {
            System.out.println("You did not get a high score.");
        }

        // && and ||

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true) { //assigns value to true and then returns value
            System.out.println("This still happens");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("this will not run");
        }

        //list of operators
        // + - * /
        // ++ --
        // ! == !=
        // && ||

        double myDouble = 20d;
        double otherDouble = 80d;
        double total = (myDouble + otherDouble) * 25d % 40d;
        System.out.println(total);
        if (total <= 20) {
            System.out.println("Total was overboard");
        }




    }
}
