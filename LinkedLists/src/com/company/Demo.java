package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
//    placesToVisit.add("Iceland");
//    placesToVisit.add("Norway");
//    placesToVisit.add("Germany");
//    placesToVisit.add("Japan");
//    placesToVisit.add("Spain");
//
//    printList(placesToVisit);
//
//    placesToVisit.add(1, "New Zealand");
//    printList(placesToVisit);
//
//    placesToVisit.remove(3);
//    printList(placesToVisit);

    addInOrder(placesToVisit, "Iceland");
    addInOrder(placesToVisit, "Norway");
    addInOrder(placesToVisit, "Germany");
    addInOrder(placesToVisit, "Japan");
    addInOrder(placesToVisit, "Spain");

    printList(placesToVisit);

    addInOrder(placesToVisit, "New Zealand");
    printList(placesToVisit);

    placesToVisit.remove(2);
    printList(placesToVisit);

    addInOrder(placesToVisit, "New Zealand");

    visit(placesToVisit);

  }

  private static void printList(LinkedList<String> linkedList) {
    Iterator<String> i = linkedList.iterator();

    while (i.hasNext()) {
      // i.next() returns next value as well as moving reference to that node
      System.out.println(i.next());
    }
    System.out.println("===================");
  }

  private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
    ListIterator<String> stringListIterator = linkedList.listIterator();

    while (stringListIterator.hasNext()) {
      int comparison = stringListIterator.next().compareTo(newCity);

      if (comparison == 0) {
        System.out.println(newCity + " already set.");
        return false;
      } else if (comparison > 0) {
        // newCity should appear before current iterator
        stringListIterator.previous();
        stringListIterator.add(newCity);
        return true;
      } else if (comparison < 0) {
        // move on to next city
        // stringListIterator.next() already took care of moving forward
      }
    }

    stringListIterator.add(newCity);
    return true;
  }

  private static void visit(LinkedList cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty()) {
      System.out.println("No cities to visit");
      return;
    } else {
      System.out.println("Visiting " + listIterator.next());
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action) {
        case 0:
          System.out.println("Bye");
          quit = true;
          break;
        case 1:
          if (!goingForward) {
            if(listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Visiting " + listIterator.next());
          } else {
            System.out.println("End of list");
            goingForward = false;
          }
          break;
        case 2:
          if (goingForward) {
            if(listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
          if (listIterator.hasPrevious()) {
            System.out.println("Visiting " + listIterator.previous());
          } else {
            System.out.println("Start of list");
            goingForward = true;
          }
          break;
      }
    }

  }
}
