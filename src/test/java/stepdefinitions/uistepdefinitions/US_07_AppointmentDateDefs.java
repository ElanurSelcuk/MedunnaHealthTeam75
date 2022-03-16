package stepdefinitions.uistepdefinitions;

import Pages.US07_AppointmentDatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_07_AppointmentDateDefs {
US07_AppointmentDatePage appointmentDatePage=new US07_AppointmentDatePage();

    @Given("user clicks my pages dropdown")
    public void user_clicks_my_pages_dropdown() {
        Driver.waitAndClick(appointmentDatePage.myPagesDropdown,2);

    }
    @Given("user selects Make an Appointment")
    public void user_selects_make_an_appointment() {
Driver.waitAndClick(appointmentDatePage.makeAnAppointment,2);

    }
    @Given("user enters current date and verify")
    public void user_enters_current_date_and_verify() {
appointmentDatePage.dateTimeBox.clear();
Driver.waitAndSendText(appointmentDatePage.dateTimeBox,"2022");
appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
Driver.waitAndSendText(appointmentDatePage.dateTimeBox,"03");
appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
Driver.waitAndSendText(appointmentDatePage.dateTimeBox,"07");

        assertTrue(appointmentDatePage.currentDateMessage.isDisplayed());
    }
    @Then("user enters future date and verify")
    public void user_enters_future_date_and_verify() {

        appointmentDatePage.dateTimeBox.clear();
        Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "2022");
        appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
        Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "03");
        appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
        Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "10");

        String date = appointmentDatePage.dateTimeBox.getAttribute("value");
        assertTrue(date.contains("2022-03-10"));
    }
        @Given("user enters the date")
        public void user_enters_the_date() {

            appointmentDatePage.dateTimeBox.clear();
            Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "03");
            appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
            Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "10");
            appointmentDatePage.dateTimeBox.sendKeys(Keys.ARROW_RIGHT);
            Driver.waitAndSendText(appointmentDatePage.dateTimeBox, "2022");
   }
        @Then("verify the format of date")
        public void verify_the_format_of_date() {
assertEquals("03-10-2022",appointmentDatePage.dateTimeBox.getAttribute("value"));


        }




}
