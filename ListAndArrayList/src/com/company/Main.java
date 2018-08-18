package com.company;

import java.util.Scanner;


public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {
    boolean quit = false;
    int choice;
    printInstructions();

    while (!quit) {
      System.out.println("Enter choice");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchItem();
          break;
        case 6:
          quit = true;
          break;
      }
    }

    scanner.close();
  }

  private static void printInstructions() {
    System.out.println("Type 0 - 6");
  }

  private static void addItem() {
    String item = scanner.next();
    scanner.nextLine();

    groceryList.addItem(item);
  }

  private static void modifyItem() {
    int pos = scanner.nextInt();
    scanner.nextLine();

    String item = scanner.next();
    scanner.nextLine();

    groceryList.modifyList(pos, item);
  }

  private static void removeItem() {
    int pos = scanner.nextInt();
    scanner.nextLine();

    groceryList.removeItem(pos);
  }

  private static void searchItem() {
    String item = scanner.next();
    scanner.nextLine();

    System.out.println(groceryList.findItem(item));
  }
}
