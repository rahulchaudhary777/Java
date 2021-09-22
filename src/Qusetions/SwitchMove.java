package Questions;

import java.util.Scanner;

public class SwitchMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y=0;
        System.out.println("Please Enter A Character ");
        char move = sc.next().charAt(0);
        switch (move) {
            case 'L' -> x++;
            case 'R' -> x--;
            case 'U' -> y++;
            case 'D' -> y--;
            default -> System.out.println("Command Is Invalid");
        }
        System.out.println(x);
        System.out.println(y);
    }
}
