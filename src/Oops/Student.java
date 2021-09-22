package oop;

import java.util.Scanner;

public class Student{
    int a, b;
    Student(){                                     // constructor
        System.out.println("Input Integer ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
    }
    public void show(){                               // Method
        System.out.println(a);
        System.out.println(b);
    }
}
class StudentMain{                                // Main Method
    public static void main(String[] args) {
        Student obj1 = new Student();            // access instance obj. in static block
        System.out.println("Outputs are :- ");
        obj1.show();                             // Method call
    }
}