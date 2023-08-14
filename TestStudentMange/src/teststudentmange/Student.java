package teststudentmange;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Info: "+"Name is "+ name+ " and age " + age;
    }

   
    
    
}
