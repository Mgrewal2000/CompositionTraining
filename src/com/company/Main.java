package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions firstTest = new Dimensions(20,12,14);
        Case theCase = new Case("220b", "Samsung", "240W", firstTest);
        Monitor monitor = new Monitor("25 Inch HP", "HP", 25, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 7, "v2.44");

        //OK so you have all the parts you need now....want to create a PC?
        PC newPc = new PC(theCase, monitor, motherboard); //Just created a PC
        newPc.powerUp();

        //Challenge
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(20, 1);
        Bed myBed = new Bed("Californian King", 4, 5, 1, 2);
        Lamp yoLamp = new Lamp("Small sized", false, 9);
        //Now you have everything you need to create a bedroom...create a bedroom now bud
        Bedroom ManusBedroom = new Bedroom("manu",wall1, wall2, wall3, wall4, ceiling, myBed, yoLamp);

        ManusBedroom.makeBed();
        ManusBedroom.getLamp().turnOn();
    }
}
