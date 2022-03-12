package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.Driver;

public class Registration_02_Steps {

    RegistrationPage rp = new RegistrationPage();
    Faker faker = new Faker();
    Registrant registrant = new Registrant();

    @Then("user creates username {string}")
    public void user_creates_username(String username) {
        username = registrant.getFirstName() + registrant.getLastName();
        registrant.setLogin(username);
        Driver.waitAndSendText(rp.usernameTextBox, username);

    }

    @Then("user provides also email {string}")
    public void user_provides_also_email(String email) {

        email = faker.internet().emailAddress();
        registrant.setEmail(email);
        Driver.waitAndSendText(rp.emailTextbox, email);

    }


    @Then("user leaves username blank {string}")
    public void user_leaves_username_blank(String username) {

        registrant.setLogin(username);
        Driver.waitAndSendText(rp.usernameTextBox, username);
        Driver.sleep(2000);
        Driver.waitAndClick(rp.passwordStrength1);

    }

    @Then("user creates an email without @ sign {string}")
    public void user_creates_an_email_without_sign(String email) {
        registrant.setEmail(email);
        Driver.waitAndSendText(rp.emailTextbox, email);
        Driver.sleep(2000);
        Driver.waitAndClick(rp.passwordStrength1);

        // }

//    @And("verifies Your username is invalid. text visible")
//    public void verifiesYourUsernameIsInvalidTextVisible() {
//        Assert.assertTrue(RegistrationPage.invalidUsernametext.isDisplayed());
//
//    }
//
//    @Given("user provides invalid username with space")
//    public void userProvidesInvalidUsername() {
//        RegistrationPage.usernameTextbox.sendKeys("molly-19 me");
//        RegistrationPage.usernameTextbox.sendKeys(Keys.ENTER);
//
        }

        @Then("verifies your username is invalid")
        public void verifies_your_username_is_invalid() {
       // Assert.assertTrue(rp.usernameError.isDisplayed());
            Assert.assertTrue(rp.requiredUserNameText.isDisplayed());

    }

        @Then("verifies your email is invalid")
        public void verifies_your_email_is_invalid() {
        Assert.assertTrue(rp.invalidEmailText.isDisplayed());


    }






    }

