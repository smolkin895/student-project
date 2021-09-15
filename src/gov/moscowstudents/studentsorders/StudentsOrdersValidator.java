package gov.moscowstudents.studentsorders;

import gov.moscowstudents.studentsorders.domain.*;
import gov.moscowstudents.studentsorders.mail.MailSender;
import gov.moscowstudents.studentsorders.validator.ChildreenValidator;
import gov.moscowstudents.studentsorders.validator.RegisterCityValidator;
import gov.moscowstudents.studentsorders.validator.StudentValidator;
import gov.moscowstudents.studentsorders.validator.WeddingValidator;

public class StudentsOrdersValidator {
    private WeddingValidator wedVal;
    private StudentValidator stuVal;
    private  RegisterCityValidator regVal;
    private ChildreenValidator chilVal;
    private MailSender mailSender;

    public StudentsOrdersValidator() {
        wedVal = new WeddingValidator();
        stuVal = new StudentValidator();
        regVal = new RegisterCityValidator();
        chilVal = new ChildreenValidator();
        mailSender = new MailSender();
    }
    public static void main(String[] args) {
        StudentsOrdersValidator stuOrVal = new StudentsOrdersValidator();
        stuOrVal.checkAll();
    }


    void checkAll() {
        StudentOrder stOr =  readingStudentOrder();
        while (true) {
           checkChildreen(stOr);
           checkRegister(stOr);
           checkStudent(stOr);
           checkWedding(stOr);
           sendMail(stOr);
           break;
        }
        System.out.println("after while loop");

    }
    AnswerChildreen checkChildreen(StudentOrder stOr){
        return chilVal.checkChildren(stOr);
    }
    AnswerCityRegister checkRegister(StudentOrder stOr){
        return regVal.checkRegister(stOr);
    }
    AnswerStudent checkStudent(StudentOrder stOr){
        return stuVal.checkStudent(stOr);
    }
    AnswerWedding checkWedding(StudentOrder stOr){
        return wedVal.checkWedding(stOr);
    }

    private StudentOrder readingStudentOrder() {
        return new StudentOrder();
    }

    private void sendMail(StudentOrder stOr) {
        mailSender.sendMailTo(stOr);
    }
}
