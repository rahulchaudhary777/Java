import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class comparator3 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new sort1());
        t.add(10);
        Collections.addAll(t,45,23,76,24);
        System.out.println(t);
    }
}
class sort1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}