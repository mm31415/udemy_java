package com.company;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public Dimension getDimensions() {
        return this.dimensions;
    }

}
