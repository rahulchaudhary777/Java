import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class R2 {
    public static void main(String[] args) {
        // Write a regular expression to represent all names end with J | j
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names :- ");
        String st = sc.nextLine();

        Pattern p = Pattern.compile("[a-zA-Z]{3,20}[j|J]+");
        Matcher m = p.matcher(st);

        while (m.find()) {
            System.out.println(m.group() + " " + m.start() + " " + m.end());
            a++;
        }
        if (a == 0) {
            System.out.println("Name not found");
        }
    }
}