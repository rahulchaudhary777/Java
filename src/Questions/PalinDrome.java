package Questions;

public class PalinDrome {
    int arr[] = {1, 1, 0, 0, 1, 1, 2}, x = 0;
    public void show(){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[arr.length-i-1]){
                x += 1;
                }
            }
        if(x>0){
            System.out.println("-1");
        }
        else{
        System.out.println("Palindrome");}
    }
}
class PalindromeMain{
    public static void main(String[] args) {
        PalinDrome obj = new PalinDrome();
        obj.show();
    }

}
