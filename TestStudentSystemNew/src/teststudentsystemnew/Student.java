/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudentsystemnew;

import java.io.Serializable;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Student implements Serializable{
    private String name; 
    private int age; 

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Info: " + "Name is " + name + " and age " + age;
    }
    
    
    
    
    
    
}
