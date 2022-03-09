package StepDefinitions.uisteps;

import Pages.RegistrationPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class Registration_01_Steps {

    Registrant registrant = new Registrant(); //save data and reuse data
    Faker faker = new Faker();
    RegistrationPage rp = new RegistrationPage(); //initialized web elements

    @Given("user provides negative ssn id  {string}")
    public void user_provides_negative_ssn_id(String ssn) {
        registrant.setSsn(ssn);

        Driver.waitAndSendText(rp.ssnTextbox, ssn);


        Driver.sleep(1000);

 }

    @Given("user leaves firstname and lastname blank {string} and {string}")
    public void user_leaves_firstname_and_lastname_blank_and(String firstname, String lastname) {

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);

        Driver.waitAndSendText(rp.firstNameTextBox, firstname);

        Driver.sleep(1000);

        Driver.waitAndSendText(rp.lastNameTextBox, lastname);

        Driver.sleep(1000);

        Driver.waitAndClick(rp.usernameTextBox, 5);
        Driver.sleep(2000);

    }

    @Given("user validates the ssn")
    public void user_validates_the_ssn() {

//        Assert.assertTrue(rp.ssnRequiredText.isDisplayed());
//        Assert.assertTrue(rp.ssnIsInvalidText.isDisplayed());




    }
    @Then("user validates the firstname and lastname")
    public void user_validates_the_firstname_and_lastname () {

//         Assert.assertTrue(rp.firstNameRequiredText.isDisplayed());
//         Assert.assertTrue(rp.lastNameRequiredText.isDisplayed());
//
//
    }

    @Given("user provides ssn id {string}")
    public void user_provides_ssn_id(String ssn) {

        //  ssn = faker.idNumber().ssnValid();
        registrant.setSsn(ssn);
        Driver.waitAndSendText(rp.ssnTextbox, ssn); //overlaoding example

    }

    @Given("user provides firstname and lastname {string} and {string}")
    public void user_provides_firstname_and_lastname_and(String firstname, String lastname) {

//        firstname = faker.name().firstName();
//        lastname = faker.name().lastName();

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);

        Driver.waitAndSendText(rp.firstNameTextBox, firstname);
        Driver.waitAndSendText(rp.lastNameTextBox, lastname);
        Driver.waitAndClick(rp.usernameTextBox, 5);
        Driver.sleep(2000);
    }

    @Then("user creates username {string}")
    public void user_creates_username(String username) {
        username = registrant.getFirstName() + registrant.getLastName();
        registrant.setLogin(username);
        Driver.waitAndSendText(rp.usernameTextBox, username);


    }

    @Then("user provides also email {string}")
    public void user_provides_also_email(String email) {
        // email = faker.internet().emailAddress();
        registrant.setEmail(email);
        Driver.waitAndSendText(rp.emailTextBox, email);

    }

    @Then("user generates the password {string}")
    public void user_generates_the_password(String password) {
        // password = faker.internet().password(8,20,true,true);
        registrant.setPassword(password);
        Driver.waitAndSendText(rp.firstPasswordTextBox, password);
        Driver.waitAndSendText(rp.newPasswordTextBox, password);

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


    @Given("user provides the password {string}")
    public void user_provides_the_password(String password) {
        Driver.waitAndSendText(rp.firstPasswordTextBox, password);
    }

    @Then("user valides the password strength {string}")
    public void user_valides_the_password_strength(String level) {

        if (1 == Integer.parseInt(level)) {
            Assert.assertTrue(rp.passwordStrength1.isDisplayed());
        } else if (2 == Integer.parseInt(level)) {
            Assert.assertTrue(rp.passwordStrength2.isDisplayed());
        } else if (3 == Integer.parseInt(level)) {
            Assert.assertTrue(rp.passwordStrength3.isDisplayed());
        }


    }
}






















//    @Then("user send the uppercase letter to the password {string}")
//    public void user_send_the_uppercase_letter_to_the_password(String password) {
//        password = faker.internet().password(8,10,true,true);
//        registrant.setPassword(password);
//        Driver.waitAndSendText(rp.NewPasswordTextBox,password);
//        Driver.waitAndSendText(rp.NewPasswordConfirmTextBox,password);
//
//
//
//    }
//    @Then("user send the lowercase letter to the password {string}")
//    public void user_send_the_lowercase_letter_to_the_password(String password) {
//        password = faker.internet().password(8,10,true,true);
//        registrant.setPassword(password);
//        Driver.waitAndSendText(rp.NewPasswordTextBox,password);
//        Driver.waitAndSendText(rp.NewPasswordConfirmTextBox,password);
//
//
//
//    }
//    @Then("user send the digit to the password {string}")
//    public void user_send_the_digit_to_the_password(String password) {
//        password = faker.internet().password(8,10,true,true);
//        registrant.setPassword(password);
//        Driver.waitAndSendText(rp.NewPasswordTextBox,password);
//        Driver.waitAndSendText(rp.NewPasswordConfirmTextBox,password);
//
//
//
//    }
//    @Then("user send the special character to make stronger password {string}")
//    public void user_send_the_special_character_to_make_stronger_password(String password) {
//        password = faker.internet().password(8,10,true,true);
//        registrant.setPassword(password);
//        Driver.waitAndSendText(rp.NewPasswordTextBox,password);
//        Driver.waitAndSendText(rp.NewPasswordConfirmTextBox,password);
//
//
//    }

