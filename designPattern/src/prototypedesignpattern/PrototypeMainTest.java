package prototypedesignpattern;

import prototypedesignpattern.baseinterface.Prototype;
import prototypedesignpattern.cloneobject.Student;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class PrototypeMainTest {
    public static void main(String[] args) {

        Student baseObject = new Student(27, 100, "SANDEEP");
        Student cloneStudent1 = (Student) baseObject.clone();
        Prototype clonePrototype = baseObject.clone();
        Student cloneStudent2 = (Student) baseObject.clone();

        System.out.println("baseObject :: " + baseObject.hashCode());
        System.out.println("cloneStudent1 :: " + cloneStudent1.hashCode());
        System.out.println("clonePrototype :: " + clonePrototype.hashCode());
        System.out.println("cloneStudent2 :: " + cloneStudent2.hashCode());
    }
}
