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
        Student s1 = new Student("Sondos", 20, 101);
         s1.addGrade(80);
        s1.addGrade(90);
        
        Student s2 = new Student("Sara", 21, 102);
        s2.addGrade(85);
        s2.addGrade(88);
        
        GraduateStudent g1 = new GraduateStudent("Noor", 25, 501, "AI in Healthcare");
        g1.addGrade(90);
        g1.addGrade(95);

        GraduateStudent g2 = new GraduateStudent("Laila", 26, 502, "Blockchain Security");
        g2.addGrade(87);
        g2.addGrade(92);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(g1);
        studentsList.add(g2);

        System.out.println("--- Student Management System Records ---");

        for (Student s : studentsList) {
            System.out.println("--------------------------------------");
            s.displayInfo();
        }
    }
} 