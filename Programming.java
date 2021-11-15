/* Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed.
 If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.*/
package questions;

public class Programming {
    String s;

    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String s){
        this.s = s;
        System.out.println(this.s);
    }
}
class Test1{
    public static void main(String[] args) {
        Programming obj1 = new Programming();
        Programming obj = new Programming("I love Java");
    }
}