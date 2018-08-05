package com.company;

public class VipCustomer {
    private String name;
    private double credit;
    private String email;

    public VipCustomer() {
        this("Default", 0.0, "Default");
    }

    public VipCustomer(String name, String email) {
        this(name, 0.0, email);
    }

    public VipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCredit() {
        return this.credit;
    }

    public String getEmail() {
        return this.email;
    }
}
