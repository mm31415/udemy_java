package com.company;

public class Computer {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
//        getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
//        getMonitor().drawPixelAt(1200, 50, "yellow");
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//    private Case getTheCase() {
//        return this.theCase;
//    }
//
//    private Monitor getMonitor() {
//        return this.monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return this.motherboard;
//    }
}
