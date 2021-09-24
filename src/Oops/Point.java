package Oops;

public class Point {
    int x;
    String y;
    public void set(){
        x = 20;
        y = "Rahul";
    }
    public void print(){
        System.out.println(x+y);
    }
}
class Test{
    public static void main(String[] args) {
        Point n = new Point();
        n.set();
        n.print();
        boolean p = true;
        boolean q = false;
        System.out.println();
    }
}
