package stepdefinitions.uisteps;

import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MyAppoinmentEditsPage;
import pojos.PhysicianEditsMyAppoinments;

public class MyAppoinmentsEditStepDefs {

    PhysicianEditsMyAppoinments physicianEditsMyAppoinments =new PhysicianEditsMyAppoinments();
    MyAppoinmentEditsPage mae =new MyAppoinmentEditsPage();

    @Given("user is on the Medunna Health Group home page")
    public void user_is_on_the_medunna_health_group_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("user clicks the account drop down icon")
    public void user_clicks_the_account_drop_down_icon() {

        mae.accountmenu.click();
    }
    @Given("user clicks  the Signinbuttononaccount menu")
    public void user_clicks_the_signinbuttononaccount_menu() {

        mae.signinbuttonataccountmenu.click();
    }
    @Given("user provides the username as {string}")
    public void user_provides_the_username_as(String username) {

      physicianEditsMyAppoinments.setLogin(username);
      Driver.waitAndSendText(mae.username,username);
    }
    @Given("user provides the password as {string}")
    public void user_provides_the_password_as(String password) {

      physicianEditsMyAppoinments.setPassword(password);
      Driver.waitAndSendText(mae.password,password);
    }
    @Given("user clicks the Sign in button")
    public void user_clicks_the_sign_in_button() {
        mae.signinbuttontoassignrole.click();

    }
    @Given("user clicks on the MY PAGES drop down")
    public void user_clicks_on_the_my_pages_drop_down() {

        Driver.waitAndClick(mae.mypagesdropdown);
    }
    @Given("user clicks on My Appoinments option")
    public void user_clicks_on_my_appoinments_option() {
        Driver.wait(1);
      mae.Myappoinmentsoptionfromdropdown.click();
    }

    @Then("user verifies Appoinments text on the page")
    public void user_verifies_appoinments_text_on_the_page() {
        Assert.assertTrue(mae.Appoinmentsheadingonthepage.isDisplayed());
    }
    @Then("user creates a new appoinment or clicks on Edit button")
    public void user_creates_a_new_appoinment_or_clicks_on_edit_button() {
        Driver.wait(3);
        mae.editbutton1appoinmentspage.click();
    }
    @Then("user verifies the Create or Edit an Appoinment text is visible on page")
    public void user_verifies_the_create_or_edit_an_appoinment_text_is_visible_on_page() {
        Assert.assertTrue(mae.createoreditanappoinmenttextonpage.isDisplayed());
    }
    @Given("user types a text to Anamanesis box")
    public void user_types_a_text_to_anamanesis_box() {

        Driver.waitAndSendText(mae.anamnesistextbox,"hksdjhfdkj");
    }
    @Given("user types a text to Treatment box")
    public void user_types_a_text_to_treatment_box() {
        Driver.waitAndSendText(mae.treatmenttextbox,"You should have a rest");
    }
    @Given("user types a text to Diagnosis box")
    public void user_types_a_text_to_diagnosis_box() {

        Driver.waitAndSendText(mae.diagnosistextbox,"myopic");
    }
    @Given("user types a text to Prescription box is optional")
    public void user_types_a_text_to_prescription_box_is_optional() {
        Driver.waitAndSendText(mae.prescriptiontextbox,"contact lens");
    }
    @Given("user types a text to Description box is optional")
    public void user_types_a_text_to_description_box_is_optional() {
       Driver.waitAndSendText(mae.descriptiontextbox,"take out your lens before sleeping");
    }
    @Then("user clicks on Status Drop Down")
    public void user_clicks_on_status_drop_down() {
        Driver.selectByIndex(mae.Statusdropdown,2);
    }
}
