package oops;

interface First1 {
    void m1();
    static void m2(){
        System.out.println("Static");
    }
    default  void m3(){
        System.out.println("Default");
    }
}
class Second1 implements First1{
    @Override
    public void m1() {
        System.out.println("Rahul");
    }
}
class Third implements First1{
    public void m1(){
        System.out.println("First");
    }
}
interface c1 extends First1{
    static void m2(){
        System.out.println("Interface");
    }
}
class Fourth{
    public static void main(String[] args) {
        Second1 obj1 = new Second1();
        obj1.m1();
        obj1.m3();              // Default method
        First1.m2();           // static method

        Third obj2 = new Third();
        obj2.m1();

        c1.m2();               // Inherit Interface
    }
}