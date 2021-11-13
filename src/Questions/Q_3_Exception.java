import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a program that takes as input the size of the array and the elements in the array.
  The program then asks the user to enter a particular index and prints the element at that index.
  Index  starts from zero.
  This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .
  Use exception handling mechanisms to handle this exception.

Sample Input and Output 1:
Enter the number of elements in the array = 2
Enter the elements in the array = 50, 80
Enter the index of the array element you want to access = 1
The array element at index 1 = 80
The array element successfully accessed

Sample Input and Output 2:
Enter the number of elements in the array = 2
Enter the elements in the array = 50, 80
Enter the index of the array element you want to access = 9
java.lang.ArrayIndexOutOfBoundsException

Sample Input and Output 3:
Enter the number of elements in the array = 2
Enter the elements in the array = 30, j
java.lang.NumberFormatException */
public class Q_3_Exception {
    int[] arr;
    int n, n1;
    Scanner sc = new Scanner(System.in);

    Q_3_Exception() {
        System.out.print("Enter the number of elements of array :- ");
        n = sc.nextInt();
        arr = new int[n];
    }

    void array() {
        try{
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();}

            System.out.print("Enter the index of the array element you want to access :- ");
            n1 = sc.nextInt();
            try{
                System.out.println("The array element at Index "+n1+" = "+arr[n1]);
                System.out.println("Array element successfully accessed");
            }
            catch (ArrayIndexOutOfBoundsException obj){
                System.out.println("Java.lang.ArrayIndexOutOfBounds");
            }
        }
        catch(InputMismatchException obj){
            System.out.println("Java.lang.NumberFormatException");
        }
    }

    void exception() {

    }

    public static void main(String[] args) {
        Q_3_Exception obj = new Q_3_Exception();
        obj.array();
        obj.exception();
    }
}