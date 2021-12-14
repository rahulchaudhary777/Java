// Write a program to accept name and age of a person from the command prompt
// (passed as arguments when you execute the class) and ensure that
// the age entered is >=18 and < 60.
// Display proper error messages.

import java.util.Scanner;

//The program must exit gracefully after displaying the error message
// in case the arguments passed are not proper.
// (Hint : Create a user defined exception class for handling errors.)
public class age extends RuntimeException{
    age(){
        super("Your age doesn't fulfil age requirement");
    }
}
class ex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18 || age > 60) {
                throw new age();
            } else
                System.out.println("your age is sufficient");
        }
        catch (age e){
            System.out.println(e);
        }
    }
}