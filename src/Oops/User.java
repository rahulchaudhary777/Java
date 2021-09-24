package Oops;

import java.util.Scanner;
// We can also use " java.util.* " for any function of util library
public class User {
    int x; String st;

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input Integer ");
        x = s.nextInt();
        s.nextLine();              // for get next line
        System.out.println("Input String ");
        st = s.nextLine();
    }
    public void print(){
        System.out.println("output Is :- " + x+"\t"+st);
    }
}
class user1{
    public static void main(String[] args) {
        User obj = new User();
        obj.input();
        obj.print();
    }
}
