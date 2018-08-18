package com.company;

import java.util.ArrayList;

public class GroceryList {

  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addItem(String item) {
    groceryList.add(item);
  }

  public void printList() {
    System.out.println("You have " + groceryList.size() + "items in list.");

    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i + 1) + ": " + groceryList.get(i));
    }
  }

  public void modifyList(int position, String item) {
    groceryList.set(position, item);
  }

  public void removeItem(int position) {
    groceryList.remove(position);
  }

  public String findItem(String item) {
//    groceryList.contains(item);
    int position = groceryList.indexOf(item);

    if (position >= 0) {
      return groceryList.get(position);
    }

    return null;
  }
}
