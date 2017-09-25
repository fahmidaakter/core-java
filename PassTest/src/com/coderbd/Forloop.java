/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author J2EE-33
 */
public class Forloop {

    private int startingNum;
    private int endingNum;
    private int sum = 0;

    public int getResult(int x, int y) {
        for (int i = x; i <= y; i++) {
            sum += i;
        }

        return sum;
    }

    public int getStartingNum() {
        return startingNum;
    }

    public void setStartingNum(int startingNum) {
        this.startingNum = startingNum;
    }

    public int getEndingNum() {
        return endingNum;
    }

    public void setEndingNum(int endingNum) {
        this.endingNum = endingNum;
    }
    
}
