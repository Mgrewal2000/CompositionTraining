package com.company;

public class PC {
    private Case theCase; //composition dawg..."PC has got a case"
    private Monitor monitor; //Composition.."PC has got a monitor"
    private Motherboard motherboard; //Composition "PC has got a motherboard"

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50, "Orange");
    }

}
