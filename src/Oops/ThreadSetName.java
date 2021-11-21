package oops;

public class ThreadSetName extends Thread{
    public static void main(String[] args) {
        // It returns of current thead name
        System.out.print("Before using setname() method : ");
        System.out.println(Thread.currentThread().getName());

        // setname() Replace current thread name by given name
        Thread.currentThread().setName("Rahul");
        System.out.print("After using setname() method : ");
        System.out.println(Thread.currentThread().getName());

        System.out.println(10/0);
    }
}
