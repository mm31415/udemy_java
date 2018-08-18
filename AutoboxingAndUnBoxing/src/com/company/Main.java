package com.company;

import java.util.ArrayList;

class IntClass {
  private int myValue;

  public IntClass(int myValue) {
    this.myValue = myValue;
  }

  public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;
  }
}


public class Main {

  public static void main(String[] args) {
    String[] strArray = new String[10];
    int[] intArray = new int[10];

    ArrayList<String> strArrayList = new ArrayList<String>();
    strArrayList.add("tim");

    // This will not work
    // Cannot create an array list out of primitive types
//    ArrayList<int> intArrayList = new ArrayList<int();

    // this works but there is kind of a lot of overhead because
    // of having to create an entire class for primitive data
    ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
    intClassArrayList.add(new IntClass(54));

    // Autoboxing is wrapping primitive with Obj
    Integer integer = new Integer(54);
    Double doubleValue = new Double(12.25);

    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    for (int i = 0; i <= 10; i++) {
      intArrayList.add(Integer.valueOf(i));
    }

    for (int i = 0; i <= 10; i++) {
      // unboxing is unwrapping the wrapped primitive type
      System.out.println(i + " --> " + intArrayList.get(i).intValue());
    }

    // This is shorter syntax
    Integer myIntValue = 56; // Integer.valueOf(56);
    int myInt = myIntValue; // myIntValue.intValue();

    ArrayList<Double> myDoubleValues = new ArrayList<Double>();

    for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
      myDoubleValues.add(dbl); // .add(Double.valueOf(dbl))
    }

    for (int i = 0; i < myDoubleValues.size(); i++) {
      double value = myDoubleValues.get(i); // myDoubleValue.get(i).doubleValue();
      System.out.println(i + " --> " + value);
    }


  }
}
