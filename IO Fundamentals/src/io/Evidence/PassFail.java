/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

/**
 *
 * @author J2EE-33
 */
public class PassFail {

    public int writtennumber;
    public int evidence;
    public String pass = "Pass";
    public String fail = "Fail";

    public PassFail(int writtennumber, int evidence) {
        this.writtennumber = writtennumber;
        this.evidence = evidence;
    }

    public int getWrittennumber() {
        return writtennumber;
    }

    public int getEvidence() {
        return evidence;
    }

    public String getPass() {
        return pass;
    }

    public String getFail() {
        return fail;
    }

    public String result() {
        String result;
        if (writtennumber >= 70 && writtennumber <= 100) {
            if (evidence >= 30 && evidence <= 50) {
                result = getPass();

            } else {
                result = getFail();
            }
        } else {
            result = getFail();
        }

        return result;
    }

    public String resultGread() {
        int total = getWrittennumber() + getEvidence();
        String result;
        if (total >= 100 && total < 120) {
            result = "D";
        } else if (total >= 120 && total < 130) {
            result = "C";
        } else if (total >= 130 && total < 140) {
            result = "B";
        } else if (total >= 140 && total < 150) {
            result = "A";
        } else {
            result = "F";
        }
        return result;
    }
}
