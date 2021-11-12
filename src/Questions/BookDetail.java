/* Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created),
price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getter methods  for all the member variables */

package questions;

public class BookDetail {
    String name, author;
    double price;
    int qty;

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    BookDetail(String name, String author, double price, int qty){
        String s1 = name;
        String s2 = author;
        double p = price;
        int q = qty;
    }
    public void show(){
       // System.out.println(s1+" "+s2+" "+p+" "+q);
    }
}
class BookMain{
    public static void main(String[] args) {
        //BookDetail obj = new BookDetail();


    }
}// Incomplete