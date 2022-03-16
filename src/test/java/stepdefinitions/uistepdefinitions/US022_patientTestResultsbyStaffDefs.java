package stepdefinitions.uistepdefinitions;

import Pages.US06_LoginPage;
import Pages.US22_StaffPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US022_patientTestResultsbyStaffDefs {

US06_LoginPage lp=new US06_LoginPage();
US22_StaffPage sp=new US22_StaffPage();
    @Given("user \\(staff) goes to homepage")
    public void user_staff_goes_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_url"));
Driver.wait(3);
    }
    @Given("user \\(staff) clicks user dropdown")
    public void user_staff_clicks_user_dropdown() throws InterruptedException {
       Driver.waitAndClick(lp.loginIcon,3);
       Driver.waitAndClick(lp.signinDropDown,3);

    }
    @Given("user \\(staff) enters username and password")
    public void user_staff_enters_username_and_password() {
        Driver.waitAndSendText(lp.usernameBox,ConfigurationReader.getProperty("staff_username"),3);
        Driver.waitAndSendText(lp.passwordBox,ConfigurationReader.getProperty("staff_password"),3);

    }
    @And("user \\(staff) clicks Sign in button")
    public void user_staff_clicks_sign_in_button() {
        lp.signInButton.click();

    }
    @Given("user\\(staff) clicks My Pages dropdown and select Search Patient")
    public void user_staff_clicks_my_pages_dropdown_and_select_search_patient() {

Driver.waitAndClick(sp.mypagesDropdown,2);
Driver.waitAndClick(sp.searchPatient,2);
    }
    @Given("user\\(staff) enters Patient SSN and verify patient")
    public void user_staff_enters_patient_ssn() {
Driver.waitAndSendText(sp.patientSSNBox,"741-85-2369",2);
assertTrue(sp.patientceyda.isDisplayed());

    }



}
