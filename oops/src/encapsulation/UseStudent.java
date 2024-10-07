package encapsulation;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class UseStudent {
    public static void main(String[] args) {
        Student student ; // Created USing Reference Variable
        student = new Student();
        student.setStudent("Sandeep",27,60.00,"Banglore");
        student.showStudent();
    }
}
