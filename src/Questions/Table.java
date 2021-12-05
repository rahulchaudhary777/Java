import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class R1 {
    public static void main(String[] args) {
        // Write a regular expression to represent all names start with N | n  with any length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names :- ");
        String st = sc.nextLine();
        Pattern p = Pattern.compile("(n|N)+[a-zA-Z]{2,}");
        Matcher m = p.matcher(st);
        int a=0;

        while(m.find()){
            System.out.println(m.group()+" "+m.start()+" "+m.end());
            a++;
        }
        if(a==0){System.out.println("(n or N) letter starting Name not found");}
}}
