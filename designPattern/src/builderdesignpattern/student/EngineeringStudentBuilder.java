package builderdesignpattern.student;

import builderdesignpattern.builder.StudentBuilder;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        this.subject = List.of("DSA", "CS", "OS");
        return this;
    }
}
