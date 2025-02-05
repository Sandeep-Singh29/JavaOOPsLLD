package builderdesignpattern.builder;

import builderdesignpattern.student.Student;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public abstract class StudentBuilder {

    public int rollNumber;
    public String name;
    public String address;
    public int age;
    public String education;
    public List<String> subject;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    abstract public StudentBuilder setSubjects();


    public Student build() {
        return new Student(this);
    }


}
