package gov.moscowstudents.studentsorders.validator;

import gov.moscowstudents.studentsorders.StudentOrder;
import gov.moscowstudents.studentsorders.domain.AnswerStudent;
import gov.moscowstudents.studentsorders.domain.AnswerWedding;

public class StudentValidator {
        public AnswerStudent checkStudent(StudentOrder order) {
        System.out.println("check student is running");
        AnswerWedding awd = new AnswerWedding();
        awd.success = false;
        return new AnswerStudent();
    }
}
