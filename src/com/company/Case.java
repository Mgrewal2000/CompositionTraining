package com.company;

public class Case {
    private String manufacturer;
    private String model;
    private String powerSupply;
    private Dimensions dimensions; //Composition

    public Case(String manufacturer, String model, String powerSupply, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
