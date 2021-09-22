package oop;

public class GetterSetter {
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String s){
        name = s;
    }
    public int getid(){
        return id;
    }
    public void setid(int s){
        id = s;
    }
}
class GetterMain{
    public static void main(String[] args) {
        GetterSetter obj = new GetterSetter();
        obj.setid(100);
        System.out.println(obj.getid());
        obj.setname("rahul");
        System.out.println(obj.getname());
    }
}