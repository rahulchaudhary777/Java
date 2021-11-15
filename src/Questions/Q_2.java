/* Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a manager
by making an object of both of these classes and print the same */
package questions;

public class Q_2 {
    String name, address;
    int age, salary, phone;

    Q_2(String name, int age, String address, int salary, int phone){
        this.name = name; this.age = age; this.address = address;
        this.salary = salary; this.phone = phone;
    }

    public void print(){
        System.out.print(this.name+" "+this.age+" "+this.address+" "+this.salary+" "+this.phone+" ");
    }
}
class Employee extends Q_2{
    String specialization;
    Employee(String name, int age, String address, int salary, int phone, String specialization){
        super(name, age, address, salary, phone);
        this.specialization = specialization;
        }
    void show(){
        System.out.println(this.specialization);
    }
}
class Manager extends Q_2{
    String departement;
    Manager(String name, int age, String address, int salary, int phone, String departement){
        super(name, age, address, salary, phone);
        this.departement = departement;
    }
    void show(){
        System.out.println(this.departement);
    }
}
class Q_2_Main{
    public static void main(String[] args) {
        Employee obj1 = new Employee("Rahul",27,"delhi",60000,1234567890,"Cloud");
        obj1.print(); obj1.show();

        Manager obj2 = new Manager("Yogesh",32,"Noida",60000,987654321,"Designing");
        obj2.print(); obj2.show();

    }
}