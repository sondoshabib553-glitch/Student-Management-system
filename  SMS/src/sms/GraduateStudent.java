/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author ayman
 */
public class GraduateStudent extends Student {
    private String researchTitle;

    public GraduateStudent(String name, int age, int studentId, String researchTitle) {
        super(name, age, studentId);
        this.researchTitle = researchTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Graduate Student: " + name + " (ID: " + studentId + "), Age: " + age + 
                           ", Research: " + researchTitle);
    }
}
    
 
