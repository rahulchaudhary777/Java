/* Write a Program to take care of Number Format Exception
   if the user enters values other than integer for calculating the average marks of 2 students.
   The name of the students and marks in 3 subjects are taken from the user while executing
   the program.
   In the same Program write your own Exception classes to take care of Negative values
   and values out of range (i.e. other than in the range of 0-100).
   Exception Handling: Throw & User Defined Exception */

import java.util.Scanner;

public class Q_5_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []arr = new String[3];
        int m1, m2, m3;

        for(int i=1;i<=2;i++){
            System.out.print("Input "+i+" student name :- ");
            arr[i] = sc.nextLine();

            System.out.print("Input 3 Subjects marks :- ");
            m1 = sc.nextInt(); m2 = sc.nextInt(); m3 = sc.nextInt();

            if(m1<0 || m2<0 || m3 <0){
                throw new Negative("Negative Input, Please Enter valid Marks");
            }
            if(m1>100 || m2>100 || m3>100){
                throw new Out("Input Marks are out of Range");
            }
            else{
                System.out.print("Average marks :- "+(m1+m2+m3)/3+"\n");
            }
        }
    }
}
class Negative extends RuntimeException{
    Negative(String msg1){
        super(msg1);
    }
}
class Out extends RuntimeException{
    Out(String msg2){
        super(msg2);
    }
}