package Oops;
/* OVERRIDING :-
   1. occurs in Two Or More Class (super class and sub. class)
   2. Name and parameter are same
   3. PURPOSE ->  use the method in child class which is already in parent class
 */
public class OverRiding {
    public void add() {
        int a = 100;
        String st = "Rahul";
        //System.out.println(a+" "+st);
    }
    public void adder(){
        int x = 500;
        System.out.println(x);
    }
}
class Dog extends Pratice{
    public void add(){
        int a = 250;
        String st = "Saurabh";

    }
    public void adder(){
        int x = 55;
        System.out.println(x);

    }

    public static void main(String[] args) {
        OverRiding obj = new OverRiding();
        obj.add();
        obj.adder();
    }
}
