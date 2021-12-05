package questions;
//Create three threads- with different priorities – MAX, MIN, NORM and start the threads at the same time.
 // Observe the completion of the threads. (Thread priorities concept)

public class Thread_Priority extends Thread{
    public void run(){
        //setPriority(MAX_PRIORITY);
        System.out.println("Hello");
    }
}
class t1 extends Thread{
    public void run(){
        //setPriority(MIN_PRIORITY);
        System.out.println("hiii");
    }

    public static void main(String[] args) {
        Thread_Priority obj1 = new Thread_Priority();
        obj1.setPriority(MIN_PRIORITY);
        obj1.start();

        t1 obj2 = new t1();
        obj1.setPriority(MAX_PRIORITY);
        obj2.start();
        System.out.println(obj1.getPriority()+" "+obj2.getPriority());
    }
}