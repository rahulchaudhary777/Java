import java.util.Scanner;
import java.util.regex.Pattern;
public class R4 {
    public static void main(String[] args) {
        // Write a program to check whether the given no is a valid mobile number or not?
        // The mobile no is entered by the command line argument
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mobile number :- ");
        String n = sc.nextLine();

        boolean p = Pattern.matches("(0|91)?[6-9][0-9]{9}",n);
        System.out.println(p);

    }
}
