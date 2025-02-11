package prototypedesignpattern.cloneobject;

import prototypedesignpattern.baseinterface.Prototype;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class Student implements Prototype {

    int age;
    private int rollNumber;
    String name;

    public Student() {
    }

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age,rollNumber,name);
    }
}
