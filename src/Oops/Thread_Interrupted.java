package oops;

class Thread_Interrupted implements Runnable{
    public void run(){
        System.out.println(Thread.interrupted());   // True -> False
        System.out.println(Thread.currentThread().isInterrupted());   // false
        System.out.println(Thread.interrupted());   // false
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new Thread_Interrupted());
        obj.start();
        obj.interrupt();  // If it is comment then all output are false
    }
}
