package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DoctorCanSeeAppointments {

    private String login;
    private String password;
    private String appointment;
    private String createdDate;
    private String endDate;
    private String id;
    private String name;

    public DoctorCanSeeAppointments() {
    }

    public DoctorCanSeeAppointments(String login, String password, String appointment, String createdDate, String endDate, String id, String name) {
        this.login = login;
        this.password = password;
        this.appointment = appointment;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.id = id;
        this.name = name;
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

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoctorCanSeeAppointments{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", appointment='" + appointment + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
