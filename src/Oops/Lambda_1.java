import java.util.Scanner;

@FunctionalInterface
public interface Lambda_1 {
    boolean greater(int a, int b);
}
class Lambda1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lambda_1 obj = (int a, int b) -> {return a>b;};
        System.out.println("Enter value of A & B  ");
        boolean res = obj.greater(sc.nextInt(),sc.nextInt());
        System.out.println(res);
    }
}
