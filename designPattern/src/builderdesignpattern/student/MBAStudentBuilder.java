package builderdesignpattern.student;

import builderdesignpattern.builder.StudentBuilder;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        this.subject = List.of("Business Economics", "MIS", "Marketing Analytics");
        return this;
    }
}
