package pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PhysicianEditsMyAppoinments {

    private String login;
    private String password;
    private String anamnesis;
    private String description;
    private String diagnosis;
    private String prescription;
    private String treatment;

    public PhysicianEditsMyAppoinments() {
    }

    public PhysicianEditsMyAppoinments(String login, String password, String anamnesis, String description, String diagnosis, String prescription, String treatment) {
        this.login = login;
        this.password = password;
        this.anamnesis = anamnesis;
        this.description = description;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.treatment = treatment;
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

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "PhysicianEditsMyAppoinments{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", description='" + description + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
}
