package questions;

import java.util.Random;

abstract public class Compartment {
    abstract public String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return"It is suitable for FirstClass Customers";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "It is suitable for Ladies";
    }
}
class General extends Compartment{
    public String notice(){
        return "It is suitable for General";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "It is suitable for Luggage";
    }
}
class TestCompartment{
    public static void main(String[] args) {
        Compartment []arr = new Compartment[10];
        Random r = new Random();

        for(int i=0;i<arr.length;i++){
            int num = r.nextInt(4);
            if(num == 0){
                arr[i] = new FirstClass();
            }
            else if(num == 1){
                arr[i] = new Ladies();
            }
            else if(num == 2){
                arr[i] = new General();
            }
            if(num == 3){
                arr[i] = new Luggage();
            }
            System.out.println(arr[i].notice());
        }
    }
}