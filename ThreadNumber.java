package questions;

class ThreadNumber extends Thread {
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            synchronized (this){
            if(i==5){
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                    System.out.println(i);
                }
            }
        }
    }}

    public static void main(String[] args) {
        ThreadNumber obj = new ThreadNumber();
        obj.start();
    }
}
