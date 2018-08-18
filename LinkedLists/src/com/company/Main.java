package com.company;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer("Jorge", 54.96);
    Customer anotherCustomer;
    anotherCustomer = customer;
    anotherCustomer.setBalance(12.18);

    System.out.println(customer.getName() + " has $" + customer.getBalance());

    ArrayList<Integer> intList = new ArrayList<Integer>();

    intList.add(1);
    intList.add(3);
    intList.add(4);

    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }

    // main problem with this is that Java will have to copy all elements
    // in current ArrayList and then insert value before adding rest of values
    // takes a lot of space an time to insert or delete
    // Check Demo for LinkedList usage
    intList.add(1, 2); // inserts the value at idx (inserts not updates)

    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }
  }
}
