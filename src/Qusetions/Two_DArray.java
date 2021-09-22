package Questions;

import java.util.Scanner;

public class Two_DArray {
    int[][] arr;

    Two_DArray(){
        arr = new int[3][3];
    }
    public void insert(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Scanner sc = new Scanner(System.in);
                System.out.print("Input "+i+"X"+j+" index element :- ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void show(){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class Two_DArrayMain{
    public static void main(String[] args) {
        Two_DArray obj = new Two_DArray();
        obj.insert();
        obj.show();
    }

}

