package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Pages.DoctorAppointmentCheckPage;
import org.junit.Assert;
import pojos.DoctorCanSeeAppointments;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MyAppointmentsCheckDoctor {

    DoctorCanSeeAppointments dcsa = new DoctorCanSeeAppointments();
    DoctorAppointmentCheckPage dacp = new DoctorAppointmentCheckPage();

    @Given("user is on the Medunna Health Group home page")
    public void user_is_on_the_medunna_health_group_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("user clicks on the account drop down icon")
    public void user_clicks_on_the_account_drop_down_icon() {
        dacp.loginDropdown.click();
    }
    @Given("user clicks the Sign in button")
    public void user_clicks_the_sign_in_button() {
        dacp.signInButton.click();
    }
    @Given("user provides the username as {string}")
    public void user_provides_the_username_as(String username) {
        dcsa.setLogin(username);
        Driver.waitAndSendText(dacp.username,username);
    }
    @Given("user provides the password as {string}")
    public void user_provides_the_password_as(String password) {
        dcsa.setPassword(password);
        Driver.waitAndSendText(dacp.password, password);
    }

    @Given("user clicks the Signin button")
    public void user_clicks_the_signin_button() {
        dacp.loginButton.click();
    }

    @Then("user clicks on MY PAGES drop down")
    public void user_clicks_on_my_pages_drop_down() {
        Driver.wait(2);
        dacp.myPagesDropdown.click();
    }
    @Then("user clicks on My Appointments option")
    public void user_clicks_on_my_appointments_option() {
        Driver.wait(1);
        dacp.myAppointmentsButton.click();
    }

    @Then("user verifies Appointments text on the page")
    public void user_verifies_appointments_text_on_the_page() {
        Assert.assertTrue(dacp.appointmentsHeader.isDisplayed());
    }
    @Given("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        Driver.wait(3);
        dacp.patientAppointmentEditButton.click();
    }
    @Given("user verifies ID field is not empty")
    public void user_verifies_id_field_is_not_empty() {
        Driver.wait(3);
       // System.out.println("ID LINE PRINTED: " + dacp.idField.getAttribute("value").trim());
      // Assert.assertNotEquals("", dacp.idField.getText().trim());
        Assert.assertFalse(dacp.idField.getAttribute("value").trim().isEmpty());

    }
    @Then("user verifies StartDateTime field is not empty")
    public void user_verifies_start_date_time_field_is_not_empty() {
        Driver.wait(3);
        Assert.assertFalse(dacp.startDateTime.getAttribute("value").trim().isEmpty());
    }
    @Then("user verifies EndDateTime field is not empty")
    public void user_verifies_end_date_time_field_is_not_empty() {
        Driver.wait(3);
        Assert.assertFalse(dacp.endDateTime.getAttribute("value").trim().isEmpty());
    }


}
