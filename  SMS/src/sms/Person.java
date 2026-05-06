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
public class Person {
    protected String name;
    protected int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
    
 
