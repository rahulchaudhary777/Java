import java.util.InputMismatchException;
import java.util.Scanner;
/* Write a class MathOperation which accepts 5 integers through command line.
      Create an array using these parameters.
      Loop through the array and obtain the sum and average of all the elements and display the result.
      Various exceptions that may arise like ArithmeticException, NumberFormatException,
      and so on should be handled. */

public class Q_4_Exception {


    int []arr;
    int sum=0,avg,n;
    Scanner sc = new Scanner(System.in);

    Q_4_Exception(){
        System.out.println("Enter length of array :- ");
        n = sc.nextInt();
        arr = new int[n];
    }
    void array(){
        System.out.println("Enter elements of array ");
        try{
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();}
            try{
                for(int j=0;j<n;j++){
                    sum += arr[j];
                }
                System.out.println("Average of array elements :- "+sum/n);
                System.out.println("Sum of Array elements :- "+sum);
            }
            catch (ArithmeticException obj){
                System.out.println("Arithmetic exception");
            }
        }
        catch (InputMismatchException obj){
            System.out.println("InputMismatchException");
        }
    }

    public static void main(String[] args) {
        Q_4_Exception obj = new Q_4_Exception();
        obj.array();
    }
}

