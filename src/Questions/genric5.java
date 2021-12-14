import java.util.ArrayList;
import java.util.Collections;

class genric5 implements Comparable<genric5> {
    int roll, age;
    String name;

    genric5(int roll, String name, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    @Override
    public int compareTo(genric5 obj) {
        if (roll > obj.age)
            return 1;
        else if (roll == obj.age)
            return 0;
        else
            return -1;
    }
}
class sort{
    public static void main(String[] args) {
        ArrayList<genric5> l = new ArrayList<>();
        l.add(new genric5(201500542,"Rahul",18));
        l.add(new genric5(201500544,"Raghav",19));
        l.add(new genric5(201500543,"Raghvendra",16));

        Collections.sort(l);
        for(genric5 obj : l){
            System.out.println(obj.name+" "+obj.roll+" "+obj.age);
        }
    }
}