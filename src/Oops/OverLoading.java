package Oops;
/* Method overloading :-
  1. occurs within ONE class
  2. Name of method is same But parameters are different
  3. Purpose -> Increase READABILITY of program
 */

public class OverLoading {
    public void show(){
        System.out.println("Rahul");
    }
    public void show(int a, int b){  // Method names are same (SHOW)
        System.out.print(a+" ");
        System.out.println(b);
    }
    public void show(int a, int b, int c){
        System.out.println(a+" "+b+" "+c);
    }
}
class OverLoadingMain {
    public static void main(String[] args) {
        Pratice obj = new Pratice();
//        obj.show();
//        obj.show(10, 20);
//        obj.show(100, 200, 300);
    }
}
