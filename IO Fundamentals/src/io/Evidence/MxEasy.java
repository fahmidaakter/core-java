/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

import static io.Evidence.MaxValue.getMaxValue;
import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class MxEasy {

    public static void main(String[] args) {
        int a[] = {5, 7, 9, 2, 4, 5};

        System.out.println("Max Number : " + getMaxValue(a));

    }

    public static int getMaxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
