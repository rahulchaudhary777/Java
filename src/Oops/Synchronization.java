package oops;

class Synchronization{
    int t_seat = 13;
    synchronized void bookseat(int seat) {

        if(t_seat >= seat){
            t_seat -= seat;
            System.out.println(seat+" seat booked successfully");
            System.out.println("Seat left :- "+t_seat);
        }
        else{
            System.out.println("Seat cannot booked\nseat left :- "+t_seat);
        }
    }
}
class SeatBookApp extends Thread{
    static Synchronization b;
    int seat1;

    public void run() {
        b.bookseat(seat1);
    }

    public static void main(String[] args) {
        b = new Synchronization();

        MyBookApp obj1 = new MyBookApp();
        obj1.seat1 = 7;
        obj1.start();

        MyBookApp obj2 = new MyBookApp();
        obj2.seat1 = 6;
        obj2.start();
    }
}