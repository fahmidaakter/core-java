/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
public class App1 {
    public static void main(String[] args) {
        ACMEBicycle bicycle = new ACMEBicycle();
        bicycle.changeCadence( 5);
        bicycle.changeGear( 6);
        bicycle.speedUp( 5);
        bicycle.applyBrakes(1);
        
        bicycle.printStates();
        
        
        
        
    }
  
}
