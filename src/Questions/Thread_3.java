package questions;
/* Create two threads, one thread to display all even numbers between 1 & 20,
   another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join.     (use of join method and thread control mechanism) */

class Thread_3 extends Thread{
    static Thread t1;
    public void run(){
        //t1 = Thread.currentThread();
        //System.out.println(t1);
        for(int i=1;i<21;i++){
            if(i%2 == 0)
                System.out.println("even :- "+i);
        }
    }
}
class Odd extends Thread{
    public void run(){
        try{
            Thread_3.t1.join();
            Thread.sleep(2000);
            for(int i=1;i<21;i++){
                if(i%2 != 0)
                    System.out.println("odd :- "+i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread_3 obj2 = new Thread_3();
        obj2.start();
        Thread_3.t1 = Thread.currentThread();

        Odd obj1 = new Odd();
        obj1.start();
    }
}