package oop;

public class ArrayCreation {

    String[] arr;                   // Array Declaration

    ArrayCreation() {
        arr = new String[5];       // Array Creation
        arr[0] = "11";           // Array Initialization
        arr[1] = "22";
        arr[4] = "44";
    }
    public void show(){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        oop.ArrayCreation obj = new oop.ArrayCreation();
        obj.show();
    }
}
