package teststudentmange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

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

//    public Student[] writeFile(String fileName, Student object[]) throws FileNotFoundException, IOException, ClassNotFoundException {
//        File file = new File(fileName);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(object);
//
//        FileInputStream fileInputStream = new FileInputStream(file);
//        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream);
//        objectInputStream1.readObject();
//
//        Student[] printData = (Student[]) (objectInputStream1.readObject());
//        return printData;
//
//    }

    @Override
    public String toString() {
        return "Student Info: " + "Name is " + name + " and age " + age;
    }
}
