package oops;

public class Boxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf("300");     // Boxing
        Integer obj1 = Integer.valueOf("200");      System.out.println(obj + obj1);
        // obj1 and obj2 have Integer value

        Integer obj2 = 200;           // AutoBoxing
        // we can not give value ( "300" ) in this type.

        int i = obj2.intValue();     // Unboxing

        int i1 = obj;            // Auto Unboxing
        System.out.println(i+"  "+i1);
    }
}
