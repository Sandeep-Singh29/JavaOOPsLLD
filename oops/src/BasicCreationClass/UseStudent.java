package BasicCreationClass;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class UseStudent {
    public static void main(String[] args) {

//        Way 1 to craete a Object of Student
        Student student;
        student = new Student();
        student.name = "Sandeep";
        student.age = 27;
        student.salary = 60.00;
        System.out.println("Student Name : "+student.name);
        System.out.println("Student Age : "+student.age);
        System.out.println("Student Salary : "+student.salary);


    }
}
