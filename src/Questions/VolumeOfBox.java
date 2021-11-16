/* Create a class Box that uses a parameterized constructor to initialize
the dimensions of a box.The dimensions of the Box are width, height, depth.
The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities.*/

package questions;

import java.util.Scanner;

public class VolumeOfBox {
    int width, height, depth;

    VolumeOfBox(int a, int b, int c){
        width = a;
        height = b;
        depth = c;
    }
    public void show(){
        System.out.println("Volume of Box :- "+(width*depth*height)+" Meter");
    }
}
class BoxMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width, Height and Depth in Meter:- ");

        VolumeOfBox obj = new VolumeOfBox(sc.nextInt(), sc.nextInt(), sc.nextInt());
        obj.show();
    }

}