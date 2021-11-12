import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    void prime(){
        int c = 0,a;
        System.out.println("Enter a number to check that it is prime or not :- ");
        a = sc.nextInt();

        for(int i=1;i<a;i++){
            if(a%i == 0){ c += 1; }
        }
        if(c == 1){  System.out.println("Number is Prime"); }
        else{  System.out.println("Number is Not Prime"); }
    }

    void factorial(){
        int res=1,f;
        System.out.println("Enter a number to get factorial :- ");
        f = sc.nextInt();

        for(int i=f;i>0;i--){ res *= i; }
        System.out.println("Factorial of given number -> "+res);
    }

    void fab(){
        int k = 0, first=0, second=1,sum,f1;
        System.out.print("Enter range of Fibonacci series -> ");
        f1 = sc.nextInt();

        while(k < f1){
            System.out.print(first+" ");
            sum = first+second; first = second;  second = sum;
            k += 1;
        }
        System.out.println("\n");
    }

}
class MenuMain{
    public static void main(String[] args) {
        Menu obj = new Menu();
         int st = 1;

        Scanner sc1 = new Scanner(System.in);
        while(st == 1){

            System.out.println("Operations :- \n1. Prime number\n2. factorial \n3. Fibonacci series\nPlease enter your choice -> ");

            int x = sc1.nextInt();
            if(x == 1){ obj.prime(); }
            if(x == 2){ obj.factorial();  }
            if(x == 3){ obj.fab(); }

            System.out.print("Do you want to continue\n1. Yes\n2. No\nPlease enter your choice :- ");
            st = sc1.nextInt();
            if(st == 2){
                System.out.println("Thank You");
            }
    }}
}
