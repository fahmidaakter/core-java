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
public class ThreadController {

    private Runner r = new Runner();
    private Runner t = new Runner(r);

    public void startThread() {
        t.start();
    }

    public void stopThread() {
        r.stopRunning();
    }
}
