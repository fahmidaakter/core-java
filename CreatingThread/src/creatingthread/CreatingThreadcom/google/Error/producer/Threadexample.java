/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread.CreatingThreadcom.google.Error.producer;

import creatingthread.CreatingThreadcom.google.Error.Threadexample.PC;

/**
 *
 * @author J2EE-33
 */
public class Threadexample {

    public static void main(String[] args) {
        throws InterruptedException {
            final PC pc = new PC();

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pc.produce();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
            );
            Thread t2 = new Thread(new Runnable(){
                @Override
                public void run() {
                    try {
                        pc.consume();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                }
            
            }
            );
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
        }
    } public static class pc{}

}
