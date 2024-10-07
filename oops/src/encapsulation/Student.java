package encapsulation;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class Student {

    private String name;
    private int age;
    private double salary;
    private String address;

    public void setStudent(String n, int a, double s, String aa) {
        name = n;
        age = a;
        salary = s;
        address = aa;
    }

    public void showStudent() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
    }

}
