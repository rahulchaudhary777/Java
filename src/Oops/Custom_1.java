import java.util.Scanner;

public class Custom_1 extends Exception {
    Custom_1(){                          // Constructor overloading
        super("You're Younger");
    }
    Custom_1(String st){
        super(st);
    }
}
class Main{
    public static void main(String[] args) throws Custom_1{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :- ");      int i = sc.nextInt();
        if(i < 18){
            throw new Custom_1(); }         //Throw custom Exception into Constructor
        else{
            System.out.println("You're Eligible for Voting");
        }
    }
}
