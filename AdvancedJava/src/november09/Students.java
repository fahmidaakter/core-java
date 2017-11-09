/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package november09;

/**
 *
 * @author J2EE-33
 */
public class Students {

    static void add(Students student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name, email, gender, hobby, round, note;
    private int age;

    public Students() {
    }

    public Students(String name, String email, String gender, String hobby, String round, String note, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.note = note;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }

    public int getAge() {
        return age;
    }


}
