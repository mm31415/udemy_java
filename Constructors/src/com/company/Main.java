package com.company;

public class Main {
    public static void main(String[] args) {

//        BankAccount acc = new BankAccount();
//
//        acc.setName("Jorge");
//        acc.setEmail("123faker@fake.com");
//        acc.setAccount(123456);
//        acc.setPhone("555-555-5555");
//
//        System.out.println(String.format("$%.2f", acc.getBalance()));
//
//        acc.deposit(-123.123);
//        acc.deposit(123.123);
////        System.out.println(String.format("$%.2f", acc.getBalance()));
//
//        acc.deposit(10);
////        System.out.println(String.format("$%.2f", acc.getBalance()));
//
//        acc.withdraw(1000);
//        acc.withdraw(100.12);
////        System.out.println(String.format("$%.2f", acc.getBalance()));

        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Jorge", "123faker@fake.com");
        VipCustomer customer3 = new VipCustomer("Jorge-ina", 23.34234, "456faker@fake.com");

        printInfo(customer1);
        printInfo(customer2);
        printInfo(customer3);
    }

    // I realize that this should be part of class but just practice for methods out here
    public static void printInfo(VipCustomer customer) {
        System.out.println(
            "Name: " + customer.getName() +
            "\nCredit: " + String.format("$%.2f", customer.getCredit()) +
            "\nEmail: " +  customer.getEmail()
        );
    }
}
