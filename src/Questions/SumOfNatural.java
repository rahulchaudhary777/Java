package Questions;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number ");
        int s = sc.nextInt();
        if (s < 0){
            System.out.println("Your Input is Invalid");
            return;
        }
        System.out.println("sum of all natural digits from 0 is :- "+(s*(s+1))/2);
    }
}
