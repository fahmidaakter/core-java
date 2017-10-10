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
class HelloRunner implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Hello " + i++);
            if (i == 50) {
                break;
            }
        }
    }

}
