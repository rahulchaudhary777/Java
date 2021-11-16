/*Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class,
then the name should be "Unknown", otherwise the name should be equal to the String value
passed while creating object of Student class. */

package questions;

import java.util.Scanner;

public class Student {
    Student(String name){
       System.out.println("Student name :- "+name);
    }
    Student(){
        System.out.println("Student Name :- Unknown");
    }
}
class StudentMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Do you Want to enter A Name (1.for_yes & 0.for_no) :- ");
        int x = sc.nextInt();

        if(x == 0){
            Student obj1 = new Student();}
        if(x == 1){
            System.out.print("Please Enter a Name :- ");
            Student obj = new Student(sc.nextLine());}
    }
}
