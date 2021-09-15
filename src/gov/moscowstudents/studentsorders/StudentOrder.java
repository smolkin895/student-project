package gov.moscowstudents.studentsorders;

import gov.moscowstudents.studentsorders.domain.Adult;
import gov.moscowstudents.studentsorders.domain.Child;

public class StudentOrder {
    public static void main(String[] args) {
        studentOrderBuilder();
    }
    static StudentOrder studentOrderBuilder() {
        Adult husbend = new Adult();
        husbend.setGivenName("Ion");
        husbend.setSurname("Perchalava");
        husbend.setPassportNumber("12299");
        StudentOrder so = new StudentOrder();
        so.husbend = husbend;
        System.out.println(husbend.getPersonString());
        return so;
    }
    long studentId;
    Adult husbend;
    Adult wife;
    Child children;
}
