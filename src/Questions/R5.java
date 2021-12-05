import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class R5 {
    public static void main(String[] args) {
        // Write a program to check whether the given mail id is valid or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a personal Email address :- ");
        String st = sc.nextLine();

        boolean p = Pattern.matches("[a-zA-Z0-9_.]+[@](gmail|yahoo|reddif)+[.]com",st);
        System.out.println("Format of given email is "+p);

        System.out.print("Enter a office Email address :- ");
        String st1 = sc.nextLine();

        boolean p1 = Pattern.matches("[a-zA-Z][a-zA-Z0-9_.]+[@][a-zA-Z_.]+",st1);
        System.out.println("Format of given email is "+p1);
    }
}
