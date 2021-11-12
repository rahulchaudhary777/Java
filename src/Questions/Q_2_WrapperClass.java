import java.util.Scanner;

/* Accept a integer number as Command line argument from the program and when
   the program is executed print the binary, octal and hexadecimal equivalent of the given number.

Sample Output:

Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
 */
public class Q_2_WrapperClass {
    int a;
    void Binary(){
        String s = Integer.toBinaryString(a);  System.out.println("Binary value :- "+s);}

    void octal(){
        String s1 = Integer.toOctalString(a);  System.out.println("octal value :- "+s1);}

    void Hexdecimal(){
        String s2 = Integer.toHexString(a);  System.out.println("HexDecimal value :- "+s2);}

}
class Q_2Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q_2_WrapperClass obj = new Q_2_WrapperClass();
        System.out.print("Enter a Value :- ");
        obj.a = sc.nextInt();
        obj.Binary(); obj.octal(); obj.Hexdecimal();
    }
}