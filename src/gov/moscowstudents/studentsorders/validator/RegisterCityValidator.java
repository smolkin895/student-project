package gov.moscowstudents.studentsorders.validator;

import gov.moscowstudents.studentsorders.StudentOrder;
import gov.moscowstudents.studentsorders.domain.AnswerCityRegister;

public class RegisterCityValidator {
    private String host;
    private String login;
    private String password;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public AnswerCityRegister checkRegister(StudentOrder order) {
        System.out.println("check register is running " + host + " ," + login + " ," + password);
        return new AnswerCityRegister();
    }
}
