import java.util.Arrays;

/* Create a class Car having properties manufacturer and price.
   Create three instances of the class and display the details of each car
   sorted with respect to the price. */
public class Car {
int price;
String man, name;

Car(String name, String man, int price){
    this.name = name; this.man = man; this.price = price;
}
}
class CarMain{
    public static void main(String[] args) {
        Car obj0 = new Car("Breeza", "Tata",1200000);
        Car obj1 = new Car("City", "Honda",1800000);
        Car obj2 = new Car("X7", "BMW",5500000);

        // Sorting
        int  []arr = {obj0.price, obj1.price, obj2.price};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
// only sort price but not display details of car by sorting price