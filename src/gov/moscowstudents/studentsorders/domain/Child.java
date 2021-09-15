package gov.moscowstudents.studentsorders.domain;

import java.time.LocalDate;

public class Child extends Person{
    private String serticateNumber;
    private LocalDate dateOfIssue;
    private String issueDepartment;

    public String getSerticateNumber() {
        return serticateNumber;
    }

    public void setSerticateNumber(String serticateNumber) {
        this.serticateNumber = serticateNumber;
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
