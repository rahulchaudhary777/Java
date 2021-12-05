import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class R3 {
    public static void main(String[] args) {
        // Write a regular expression to represent all names start with N|n  and ends with j|J
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Names :- ");
        String st = sc.nextLine();

        Pattern p = Pattern.compile("(N|n)[a-zA-Z]{3,20}[j|J]+[ ]");
        Matcher m = p.matcher(st);

        while (m.find()) {
            System.out.println(m.group() + " " + m.start() + " " + (m.end()-1));
            a++;
        }
        if (a == 0) {
            System.out.println("Name not found");
        }
    }
}
