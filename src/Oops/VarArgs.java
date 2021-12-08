package oops;

//import questions.array.Practice;

public class VarArgs {
    public void add(int... a){
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int x = 10;
        var y = 20;
        var z = "Rahul";     // Var Keyword :- It finds datatype of any variable automatically.

        System.out.println(x+y+z);
        VarArgs obj = new VarArgs();
        obj.add(12, 18, 5, 5);
        obj.add(12, 2);           // In Variable Arguments We can give any no. of arguments.
        obj.add();
    }
}
