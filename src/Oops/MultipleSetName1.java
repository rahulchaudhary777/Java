package oops;

class MultipleSetName extends Thread{
    // Thread Topic
    public void run(){
        System.out.println(Thread.currentThread().getName());
        // change Thread name
        Thread.currentThread().setName("Java1");
        System.out.println("After change thread name :- "+Thread.currentThread().getName()+"\n");
    }
}
class MultipleSetName1 extends Thread{
    // Thread Topic
    public void run(){
        System.out.println(Thread.currentThread().getName());
        // change Thread name
        Thread.currentThread().setName("Java2");
        System.out.println("After change thread name :- "+Thread.currentThread().getName()+"\n");
    }
}
class SMain{
    public static void main(String[] args) {
        MultipleSetName obj1 = new MultipleSetName();
        obj1.start();

        MultipleSetName1 obj2 = new MultipleSetName1();
        obj2.start();

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("JVM");
        System.out.println("After change main thread name : "+Thread.currentThread().getName());
    }
} // In output any thread occur in any order