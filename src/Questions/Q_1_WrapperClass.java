/* Write a java program which generates the minimum and maximum value
   for each of the Numeric Wrapper classes (Byte, Short, Integer, Long, Float, Double)
Sample Output:
Integer range:
min: -2147483648
max: 2147483647
Double range:
min: 4.9E-324
max: 1.7976931348623157E308
 */
public class Q_1_WrapperClass {
    void Int(){
        Integer i1 = Integer.MAX_VALUE; Integer i2 = Integer.MIN_VALUE;
        System.out.println("Min :- "+i2+"\n"+"Max :- "+i1);
    }
    void ShorT(){
        Short i1 = Short.MAX_VALUE; Short i2 = Short.MIN_VALUE;
        System.out.println("Min :- "+i2+"\n"+"Max :- "+i1);
    }
    void LonG(){
        Long i1 = Long.MAX_VALUE; Long i2 = Long.MIN_VALUE;
        System.out.println("Min :- "+i2+"\n"+"Max :- "+i1);
    }
    void DouBle(){
        Double i1 = Double.MAX_VALUE; Double i2 = Double.MIN_VALUE;
        System.out.println("Min :- "+i2+"\n"+"Max :- "+i1);
    }
}
class Q_1Main{
    public static void main(String[] args) {
        Q_1_WrapperClass obj = new Q_1_WrapperClass();
        obj.Int();  obj.DouBle();  obj.LonG();  obj.ShorT();
    }
}
