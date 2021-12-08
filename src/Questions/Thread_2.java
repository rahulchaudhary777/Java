package questions;
/* store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
    display all colours repeatedly by generating colour index from Random class.
    If the random colour index matches to red stop display.
Note: perform this task by implementing Runnable interface */

import java.util.Objects;
import java.util.Random;

class Thread_2 implements Runnable{
    String []colour = {"white","blue","black","green","red","yellow"};
    Random r = new Random();
    int x = 0;

    public void run(){
        while(!Objects.equals(colour[x], "red")){
            x = r.nextInt(5);
            System.out.println(colour[x]);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Thread_2());
        t.start();
    }
}
