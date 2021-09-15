package gov.moscowstudents.studentsorders.validator;

import gov.moscowstudents.studentsorders.StudentOrder;
import gov.moscowstudents.studentsorders.domain.AnswerChildreen;

public class ChildreenValidator {
        public AnswerChildreen checkChildren(StudentOrder order) {
        System.out.println("check childreen is running");
        return new AnswerChildreen();
    }
}
