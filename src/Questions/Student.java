/*Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class,
then the name should be "Unknown", otherwise the name should be equal to the String value
passed while creating object of Student class. */

package questions;

import java.util.Scanner;

public class Student {
    String s1;
    Student(String name){
        if(name.length() >= 1){
            s1 = name;
        }
        else{
            s1 = "Unknown";
        }
    }
}
class StudentMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student obj = new Student(sc.next());
        System.out.println(obj.s1);
    }
}