@FunctionalInterface
public interface Lambda_2 {
    void run();
}
class Lambda2{
    public static void main(String[] args) {
        Lambda_2 obj = () -> System.out.println("Lambda Expression");
        obj.run();
    }
}