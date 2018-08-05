package com.company;

public class BankAccount  {

    private int account;
    private double balance = 0;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        this(56789, 2.50, "Name", "Address", "Phone"); // this line calls a different constructor
        System.out.println("Empty Constructor created");
    }

    public BankAccount(int account, double balance, String name,
                       String email, String phone) {
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return this.account;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(String.format("$%.2f", amount) + " was deposited.");
            System.out.println("Balance is now: " + String.format("$%.2f", this.balance));
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount && amount >= 0) {
            this.balance -= amount;
            System.out.println(String.format("$%.2f", amount) + " was withdrawn.");
            System.out.println("Balance is now: " + String.format("$%.2f", this.balance));
        } else {
            System.out.println("Insufficient amount of funds.");
        }
    }
}
