// Topic :- Abstraction
package oops;

abstract public class Abstract {
    public int num1;
    public int num2;

    Abstract(int t1, int t2){
        num1 = t1;
        num2 = t2;
    }
}
class First extends Abstract{
    int num3, num4;
    First(int t1, int t2, int t3, int t4){
        super(t1,t2);
        num3 = t3;
        num4 = t4;
        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }
}
class Second extends Abstract{
    int num5, num6;

    Second(int t1, int t2, int t5, int t6){
        super(t1, t2);
        num5 = t5;
        num6 = t6;
        System.out.println(num1+" "+num2+" "+num5+" "+num6);
    }
}
class Main{
    public static void main(String[] args) {
        First obj1 = new First(10, 20, 30, 40);
        Second obj2 = new Second(11, 22, 33, 44);
    }
}