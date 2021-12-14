import java.util.*;

// Take input of list from user and print it.
public class Genric2<T extends String>{
   int a=10;

    public static void main(String[] args) throws IndexOutOfBoundsException{
        ArrayList<Integer> m= new ArrayList<>();
        ArrayList<Integer> m1 = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<3;i++){
            m.add(i);
        }
        m.add(2,-1);        // insert value at any index
        System.out.println(m);           // print list in single line

        Collections.addAll(m,11,12,13);    // Add multiple elements at one time in list
        System.out.println("maximum value of list: "+Collections.max(m)+"\nMinimum value of list: "+Collections.min(m));

        Collections.addAll(s,9,8,7,6,5,4,3);
        Collections.swap(m,1,4);       // It applies only list
        System.out.println("list: "+m+"\nset: "+s);
//        Collections.copy(m1,m);                         // It applies only list with same wrapper class
//        System.out.println("copied list: "+m1);

        System.out.println(m.size());  // Return size of any collection
        System.out.println(m.contains(12));  // Return true if collection contain specific value
        System.out.println(m.containsAll(s)); // Return true if a collection contain all object of second collection

        //System.out.println(m.retainAll(s));
        s.clear(); // clear all elements of any collection
        System.out.println(s);
        System.out.println(s.isEmpty());  // Return True if collection is empty

        m.toArray();
        m.set(2,100);  // replace value at any index
        System.out.println(m);


    }
}
