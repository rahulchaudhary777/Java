package Oops;

public class VarKeyword {
    int num;
    //var num1 = 100;                  var not declare in class.

    public static void main(String[] args){
        var a = 200;
        int x = 100;

        var f = 10.5;
        var st = "Rahul";

        int []arr = {1,2,3,4};
        //var []arr = {10,20,30,40};      Can't Declare arr with var keyword
        System.out.println(st);
        System.out.println(f);
        System.out.println(a);
    }
}
