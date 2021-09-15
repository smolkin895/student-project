package gov.moscowstudents.studentsorders.validator;
import gov.moscowstudents.studentsorders.StudentOrder;
import gov.moscowstudents.studentsorders.domain.AnswerWedding;


public class WeddingValidator {
        public AnswerWedding checkWedding(StudentOrder order) {
        System.out.println("check wedding is running");
        AnswerWedding wedding = new AnswerWedding();
        wedding.success = false;
        return wedding;
    }
}
