package builderdesignpattern;

import builderdesignpattern.director.Director;
import builderdesignpattern.student.EngineeringStudentBuilder;
import builderdesignpattern.student.MBAStudentBuilder;
import builderdesignpattern.student.Student;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class BuilderPatternMainTest {
    public static void main(String[] args) {

        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
