import java.util.Scanner;

public class Resources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = 10/a;
            int []c = {1};
            System.out.println(c[4]);
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        catch (ArithmeticException obj){
            System.out.println(obj);
        }
        finally {
            System.out.println("End of The Code");
            sc.close();
        }
    }
}
