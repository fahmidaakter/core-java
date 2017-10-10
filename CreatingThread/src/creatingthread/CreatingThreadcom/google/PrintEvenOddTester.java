/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread.CreatingThreadcom.google;

/**
 *
 * @author J2EE-33
 */
public class PrintEvenOddTester {

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
        t1.start();
        t2.start();
    }

}