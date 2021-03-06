package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
        this.chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking.");
        // even though this move is super.move() it is
        // better practice to just use move() in case of
        // a method being overridden such as eat() was
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        // even though this move is super.move() it is
        // better practice to just use move() in case of
        // a method being overridden such as eat() was
        move(10);
    }

    public int getEyes() {
        return this.eyes;
    }

    public int getLegs() {
        return this.legs;
    }

    public int getTail() {
        return this.tail;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public String getCoat() {
        return this.coat;
    }
}
