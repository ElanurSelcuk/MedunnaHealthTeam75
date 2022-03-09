package stepdefinitions.uisteps;

import io.cucumber.java.en.Then;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.Driver;

public class Registration_02_Steps {

    RegistrationPage rp = new RegistrationPage();
    // Faker faker = new Faker();
    Registrant registrant = new Registrant();

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



    }



    }
