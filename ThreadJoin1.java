package questions;

public class ThreadJoin1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class ThreadJoin2 extends Thread{
    @Override
    public void run() {

        for(int i=6;i<11;i++){
            System.out.println(i);
        }
    }
}
class Main3{
    public static void main(String[] args) throws InterruptedException{

        ThreadJoin1 obj1 = new ThreadJoin1();
        obj1.start();
        obj1.join();

        ThreadJoin2 obj2 = new ThreadJoin2();
        obj2.start();


    }
}