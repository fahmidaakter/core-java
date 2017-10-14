/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread.CreatingThreadcom.google.Error.producer;

/**
 *
 * @author J2EE-33
 */
public class Producer implements Runnable {

    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    public Producer(SyncStack s) {
        theStack = s;
       num = counter++;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 + 'A');
            theStack.push(c);
            System.out.println("Producer" + num + ":" + c);
            try {
                Thread.sleep((int) (Math.random() * 300));
            } catch (InterruptedException e) {
                //ignore it
            }

        }
    }

}
