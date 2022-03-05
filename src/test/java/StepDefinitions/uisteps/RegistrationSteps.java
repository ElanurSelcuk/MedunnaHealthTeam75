package StepDefinitions.uisteps;

import Pages.RegistrationPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrationSteps {
    Registrant registrant = new Registrant(); //save data and reuse data
    Faker faker = new Faker();
    RegistrationPage rp = new RegistrationPage(); //initialized web elements

    @Given("user provides ssn id {string}")
    public void user_provides_ssn_id(String ssn) {

        ssn = faker.idNumber().ssnValid();
        registrant.setSsn(ssn);
        Driver.waitAndSendText(rp.ssnTextbox,ssn); //overlaoding example

    }

    @Given("user provides firstname and lastname {string} and {string}")
    public void user_provides_firstname_and_lastname_and(String firstname, String lastname) {

        firstname = faker.name().firstName();
        lastname = faker.name().lastName();

        registrant.setFirstname(firstname);
        registrant.setLastname(lastname);

        Driver.waitAndSendText(rp.firstNameTextBox,firstname);
        Driver.waitAndSendText(rp.lastNameTextBox,lastname);
    }

    @Then("user creates username {string}")
    public void user_creates_username(String username) {
        username = registrant.getFirstname() + registrant.getLastname();
        registrant.setUsername(username);
        Driver.waitAndSendText(rp.usernameTextBox,username);


    }

    @Then("user provides also email {string}")
    public void user_provides_also_email(String email) {
        email = faker.internet().emailAddress();
        registrant.setEmail(email);
        Driver.waitAndSendText(rp.emailTextBox,email);

    }

    @Then("user generates the password {string}")
    public void user_generates_the_password(String password) {
        password = faker.internet().password(8,20,true,true);
        registrant.setPassword(password);
        Driver.waitAndSendText(rp.NewPasswordTextBox,password);
        Driver.waitAndSendText(rp.NewPasswordConfirmTextBox,password);

    }
    @Then("user registers and validates")
    public void user_registers_and_validates() {
        Driver.waitAndClick(rp.registerButton);
        Assert.assertTrue(Driver.waitForVisibility(rp.successMessageToastContainer, 5).isDisplayed());
    }
    @Then("user creates the records to a correspondent file")
    public void user_creates_the_records_to_a_correspondent_file() {
        saveRegistrantData(registrant);
    }

}