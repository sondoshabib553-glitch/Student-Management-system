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
public class Student extends Person {
    
    protected int studentId;
    protected ArrayList<Integer> grades;
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
 
