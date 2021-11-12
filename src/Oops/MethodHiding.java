package oops;

public class MethodHiding {
    static void show(){
        System.out.println("Parent class method");
    }
}
class A extends MethodHiding{
    static void show(){
        System.out.println("child class method");
    }
}
class B{
    public static void main(String[] args) {
        MethodHiding obj = new A();
            obj.show();
    }
}