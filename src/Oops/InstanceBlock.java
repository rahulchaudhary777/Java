package oop;

public class InstanceBlock {
    int a, b;
    public void user(){
        a = 10;                  // Instance objects -> it can access in Instance area directly
        b = 20;
    }
    InstanceBlock(){           // constructor
        a = 70; b = 80;        //  Direct access Instance objects
        System.out.println(a+" "+b);
    }
    {                              // Instance block -> It always executes before constructor
        a = 45; b = 55;
        System.out.println(a+" "+b);
    }
    public void show(){             // Method
        System.out.println(a+" "+b);
    }
}
class InstanceBlockMain{                   // Main Method
    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();    // Create obj. for access Instance obj. in Static area
        obj.user();                                 // Method call
        obj.show();
    }
}
