package oops;

interface ObjClass {
    default void m1(){
        System.out.println("1");
        System.out.println("2");
        m3();                    // nesting of methods
    }
    default void m2(){
        System.out.println("3");
        System.out.println("4");
        m3();                    // nesting of methods
    }
    private void m3(){
        System.out.println("5");
        System.out.println("6");
    }
}
class M implements ObjClass{

}
class M1{
    public static void main(String[] args) {
        M obj = new M();
        obj.m1();
        System.out.println();
        obj.m2();
        }
    }
