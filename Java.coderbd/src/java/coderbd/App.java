/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.coderbd;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Person person=new Person("Sonjana", 25, 25000);
        System.out.println(person.getDepartment()+ "name->" +person.getName()
                +"age->"+ person.getAge()
                +"salary->"+ person.getSalary()
                +"department->");
    }
}
