package com.company;

public class Main {

    public static void main(String[] args) {

        // 50 is literal
        // myVariable = 50 is the expression
        // int myVariable = 50; is the statement
        int myVariable = 50;
        myVariable++; //this full line is a statement

        // method call: sout, expression: "this is a text", semi-colon make the statement
        System.out.println("This is a test");

        int a = 50; a++; //multiple statements but not ideal

        int b
                =
                50
                ; // this is valid because Java compiler gets rid of whitespace

    }
}
