package stepdefinitions.uisteps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAppoinmentEditsPage;
import pages.MyAppoinmentEditsTestPage;
import pojos.PhysicianEditTestResult;
import pojos.PhysicianEditsMyAppoinments;
import utilities.Driver;

public class MyAppoinmentsEditsTestResultsStepDefs {

    PhysicianEditTestResult physicianEditTestResult = new PhysicianEditTestResult();
    PhysicianEditsMyAppoinments physicianEditsMyAppoinments =new PhysicianEditsMyAppoinments();
    MyAppoinmentEditsPage mae =new MyAppoinmentEditsPage();
    MyAppoinmentEditsTestPage mte =new MyAppoinmentEditsTestPage();

    @Then("user clicks Show test results button")
    public void user_clicks_show_test_results_button() {
        Driver.waitAndClick(mte.showtestresultsbutton);

    }
    @Then("user clicks View Results button")
    public void user_clicks_view_results_button() {
       Driver.waitAndClick(mte.viewresultsbutton1);
    }
    @Then("user verifies Test Results text on page")
    public void user_verifies_test_results_text_on_page() {
        Assert.assertTrue(mte.testresultsheading.isDisplayed());
    }
}
