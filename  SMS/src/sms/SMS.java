/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.util.ArrayList;

/**
 *
 * @author ayman
 */
public class SMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        Student s1 = new Student("Ahmed", 20, 101);
        Student s2 = new Student("Sara", 21, 102);
        GraduateStudent g1 = new GraduateStudent("Mohamed", 25, 501, "AI in Healthcare");
        GraduateStudent g2 = new GraduateStudent("Laila", 26, 502, "Blockchain Security");
 
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(g1);
        studentsList.add(g2);

   
        for (Student s : studentsList) {
            s.displayInfo(); 
    }
    }   
}
