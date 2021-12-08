package questions;
/* Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads.
   Display both thread names. */
class Thread_1 extends Thread{
    public void run(){
        System.out.println("Scooby");
    }
}
class Shaggy extends Thread{
    public void run() {
        System.out.println("Shaggy");
    }

    public static void main(String[] args) {
        Thread_1 obj1 = new Thread_1();
        obj1.start();

        Shaggy obj2 = new Shaggy();
        obj2.start();
    }
}