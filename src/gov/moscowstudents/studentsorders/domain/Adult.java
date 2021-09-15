package gov.moscowstudents.studentsorders.domain;

import gov.moscowstudents.studentsorders.domain.Person;

import java.time.LocalDate;

public class Adult extends Person {
    private String passportSeria;
    private String passportNumber;
    private LocalDate  dateOfIssue;
    private String issueDepartment;
    private String university;
    private String studentId;

    public String getPersonString() {
        return givenName + " " + surname + " " + passportNumber;
    }

    public String getName(){
        return givenName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
