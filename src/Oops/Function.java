package oops;

public class Function {
    public static void main(String []args) {
        System.out.println("Function calling ");
        fun();
    }
    public static void fun () {
        System.out.println("fun function Call");
        int a = 12;
        String st = "Rahul";

        System.out.println(a+" "+st);

        fun1(55,"Delhi to Jaipur");
    }
    public static void fun1(int a,String st){
        System.out.println("fun1 function Call");
        int a1 = a;
        String st1 = st;
        System.out.println(a+" "+st);
        System.out.println(a1+" "+st1);
    }
}

