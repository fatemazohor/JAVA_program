package q2generic;

import java.util.Arrays;

public class Q2Generic {


    public static void main(String[] args) {
//   
    
        GenericClass<Integer> age = new GenericClass<>(2);
        System.out.println(age.getObject());
        int age1 = age.typeCasting(age);
        GenericClass<Double> weight = new GenericClass<>(55.69d);
        System.out.println(weight.getObject());
        
        System.out.println("");
        GenericClass<String> name = new GenericClass<>("Abed");
        System.out.println(name.getObject());
        
//        double m = (weight/(age*age));
        System.out.println(age1*3);
//        
        
        
        
        
        
        
        
        
        
        
    
//        GenericClass[] mydata = new GenericClass[3];
//        mydata[0] = new GenericClass("Abid");
//        mydata[1] = new GenericClass("Pavel");
//        mydata[2] = new GenericClass("Jaman");
//        
//        System.out.println(Arrays.toString(mydata));
    
    
    }   
//    public static double showBMI(GenericClass height, GenericClass weight){
//        final double n = 2.85;
////        double m = weight/(height*height);
//        return 1;
//    }
    
}
