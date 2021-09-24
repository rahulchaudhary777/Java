package Oops;

import java.util.Scanner;

public class InputChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Character ");
        char c = sc.next().charAt(0);

        System.out.println("output :- "+c);
    }
}
