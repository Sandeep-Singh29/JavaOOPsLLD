package builderdesignpattern.student;

import builderdesignpattern.builder.StudentBuilder;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class Student {

    int rollNumber;
    String name;
    String address;
    int age;
    String education;
    List<String> subject;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.education = builder.education;
        this.subject = builder.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", subject=" + subject +
                '}';
    }
}
