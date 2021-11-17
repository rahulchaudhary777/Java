// Implementation of Anonymous class
public interface Anonymous {
    void run();
}
class Ano{
    public static void main(String[] args) {
        Anonymous obj = new Anonymous() {
            @Override
            public void run() {
                System.out.println("Implementation of Anonymous class");
            }
        };
        obj.run();
    }
}