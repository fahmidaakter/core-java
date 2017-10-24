/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author J2EE-33
 */
public class FontInfo {
    public static void main(String[] args) {
        Toolkit theKit = Toolkit.getDefaultToolkit();
        System.out.println("\nSceen Resolution :"+ theKit.getScreenResolution()+" DOTS PER INCH");
        Dimension sceenDim = theKit.getScreenSize();
        System.out.println("Sceen Size :"+sceenDim.width+" by "+sceenDim.height+" pixels");
        GraphicsEnvironment a= GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames = a.getAvailableFontFamilyNames();
        System.out.println("\nFonts available on this platform:   ");
        int count =0;
        for(String fontname : fontnames){
            System.out.printf("%-50s", fontname);
            if(++count % 4 == 0){
                System.out.println();
            }
        }
        return;
    }
 
      
}
