/* Design an application in java that contains a class Student having properties
 name and percentage. Create a class Test that declares three instances of Student class.
 The values are passed through constructor at the time of its object creation.
 The output should be the name and percentage of the topper.
 */
package questions;

public class TopperStudent {
    int per;
    String name;
    TopperStudent(int per, String name){
        this.name = name;
        this.per = per;
    }
}
class Test{
    public static void main(String[] args) {
        TopperStudent obj1 = new TopperStudent(85,"Ajay");
        TopperStudent obj2 = new TopperStudent(80, "vishal");
        TopperStudent obj3 = new TopperStudent(90, "sunny");

        System.out.println("Topper :- ");
        if((obj1.per > obj2.per) && (obj1.per > obj3.per)){
            System.out.println(obj1.name +" -> "+obj1.per);
        }
        else if((obj2.per > obj1.per) && (obj2.per > obj3.per)){
            System.out.println(obj2.name +" -> "+obj2.per);
        }
        else{
            System.out.println(obj3.name +" -> "+obj3.per);
        }
    }
}
