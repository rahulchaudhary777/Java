package Oops;
/* Two Types of Constructors ->
*                            1. No-Argument Constructor
*                            2. Parameterized Constructor */
public class ConstructorType {
    int a, b;
    ConstructorType(){                  // No-Argument Constructor
        a = 12; b = 20;
        System.out.println(a+" "+b);
    }
    ConstructorType(int ta, int tb){           // Parameterized Constructor
        a = ta;
        b = tb;
        System.out.println(a+" "+b);
    }
}
class ConstructorTypeMain{
    public static void main(String[] args) {
        ConstructorType obj = new ConstructorType(30,40);
        ConstructorType obj1 = new ConstructorType();
    }
}
