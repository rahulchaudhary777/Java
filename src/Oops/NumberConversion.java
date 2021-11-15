package oops;

import java.util.Scanner;

public class NumberConversion {
    // Number conversion using wrapper classes (Integer -> any base)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer value -> ");
        int a = sc.nextInt();

        // convert into binary
        String s1 = Integer.toBinaryString(a);  System.out.println("Binary value :- "+s1);

        // convert into octal
        String s2 = Integer.toOctalString(a);  System.out.println("octal value :- "+s2);

        // convert into Hexadecimal
        String s3  = Integer.toHexString(a);  System.out.println("Hexadecimal value :- "+s3);

    }
}
