/* Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/
package questions;

public class Calculator {
    static int num1, num2;

    public static int powerInt(int num1, int num2){
        int x = (int) Math.pow(num1, num2);
        return x;
    }
    public static double powerDouble(double num1, double num2){
        double y = (double) Math.pow(num1, num2);
        return y;
}}
class CalculatorMain{
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(11,8));
        System.out.println(Calculator.powerDouble(200,10));
    }
}
