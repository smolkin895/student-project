package gov.moscowstudents.studentsorders.mail;

import gov.moscowstudents.studentsorders.StudentOrder;

public class MailSender {
    public void  sendMailTo(StudentOrder stOr){
        System.out.println("mail report to " + stOr);
    }
}
