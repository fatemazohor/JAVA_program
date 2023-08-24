package testcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

    public static void main(String[] args) {
        
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Abid", 30));
        al.add(new Student("Jafar", 31));
        Iterator<Student> stu = al.iterator();
        
        while (stu.hasNext()) {
            Student next = stu.next();
            System.out.println(next);
        }
        
    }    
}
