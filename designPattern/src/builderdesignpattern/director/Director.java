package builderdesignpattern.director;

import builderdesignpattern.builder.StudentBuilder;
import builderdesignpattern.student.EngineeringStudentBuilder;
import builderdesignpattern.student.MBAStudentBuilder;
import builderdesignpattern.student.Student;

import java.util.List;


/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(27).setEducation("MCA").setAddress("Auraiya UP").setName("sandeep").setSubjects().build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(11).setAge(24).setEducation("MBA").setAddress("Auraiya UP").setName("Kuldeep").setSubjects().build();
    }

}
