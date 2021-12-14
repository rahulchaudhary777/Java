import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class srt{
    public int id;
    public String name;
    srt(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name+" "+id;
    }
}
class imp implements Comparator<srt>{

    @Override
    public int compare(srt o1, srt o2) {
        return o1.name.compareTo(o2.name);
  }
}
class imp1 implements Comparator<srt>{

    @Override
    public int compare(srt o1, srt o2) {
        return o1.id>o2.id?1:-1;
    }
}
public class comparator2 {
    public static void main(String[] args) {
        ArrayList<srt> l = new ArrayList<>();
        l.add(new srt("rahul",200));
        l.add(new srt("anuj",240));
        l.add(new srt("ajay",100));

        Collections.sort(l,new imp());
        System.out.println("sorting through name: "+l);
        Collections.sort(l,new imp1());
        System.out.println("sorting through id: "+l);
    }
}
