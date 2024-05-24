package OOP2.genericClasses;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        myGenericClass <Integer, Integer> myInt = new myGenericClass <>(1, 9);
        myGenericClass <Double , Double> myDouble = new myGenericClass <>(3.14 , 1.01);


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
    }
}
