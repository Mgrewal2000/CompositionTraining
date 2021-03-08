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
        newPc.getMonitor().drawPixelAt(45,65,"Yellow");
        newPc.getMotherboard().loadProgram("Warzone"); //accessing methods using composition
        newPc.getTheCase().pressPowerButton(); //PC object accessing different methods
    }
}
