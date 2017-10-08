/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.Comparator;

/**
 *
 * @author J2EE-33
 */
public class GradeComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Student) o1).StudentID == ((Student) o2).StudentID) {
            return 0;
        } else if (((Student) o1).StudentID < ((Student) o2).StudentID) {
            return -1;
        } else {
            return 1;
        }
    }

}
