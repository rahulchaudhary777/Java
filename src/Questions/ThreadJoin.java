package questions;

class ThreadJoin implements Runnable{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(1300);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
       Thread obj = new Thread(new ThreadJoin());
       obj.start();
       obj.join();

       for(int i=6;i<11;i++){
           System.out.println(i);
       }
    }
}
