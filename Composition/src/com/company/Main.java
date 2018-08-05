package com.company;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27 in Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Computer computer = new Computer(theCase, monitor, motherboard);

//        computer.getMonitor().drawPixelAt(3, 67,  "orange");
//        computer.getMotherboard().loadProgram("Windows 1.0");
//        computer.getTheCase().pressPowerButton();
        computer.powerUp();
    }

}
