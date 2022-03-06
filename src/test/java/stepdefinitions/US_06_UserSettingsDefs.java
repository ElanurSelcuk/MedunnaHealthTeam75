package stepdefinitions;

import Pages.LoginPage;
import Pages.UserSettingsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class US_06_UserSettingsDefs {
LoginPage loginPage=new LoginPage();
UserSettingsPage userSettings=new UserSettingsPage();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("app_url"));
       loginPage.loginIcon.click();
       Thread.sleep(2000);
       loginPage.signinDropDown.click();

       loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("patient_username"));
       Thread.sleep(1000);

       loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("patient_password"));
        Thread.sleep(1000);
       loginPage.signInButton.click();
    }

    @Given("user clicks user dropdown")
    public void user_clicks_user_dropdown() {
     userSettings.userSettingsIcon.click();
    }
    @Given("user clicks Settings")
    public void user_clicks_settings() {
        userSettings.userSettingsDropdown.click();
    }

    @Then("verify the user info")
    public void verify_the_user_info() {

Driver.waitAndGetText(userSettings.title,2);

    }
    @Given("user verify the update option for firstname")
    public void user_verify_the_update_option_for_firstname() {
    assertTrue(userSettings.firstName.isDisplayed());

    userSettings.firstName.clear();
  userSettings.firstName.sendKeys("Arjola");
    userSettings.saveButton.click();
        Driver.wait(2);
    assertTrue(userSettings.succesfullyMessage.isDisplayed());
        Driver.wait(2);
    }
    @Given("user verify the update option for lastname")
    public void user_verify_the_update_option_for_lastname() {
        Assert.assertTrue(userSettings.lastName.isDisplayed());
        userSettings.lastName.clear();
        userSettings.lastName.sendKeys("world");
        userSettings.saveButton.click();
        Driver.wait(2);
        assertTrue(userSettings.succesfullyMessage.isDisplayed());
        Driver.wait(2);
    }
    @Given("user verify the update option for e-mail")
    public void user_verify_the_update_option_for_e_mail() {
       Assert.assertTrue(userSettings.eMail.isDisplayed());
       Driver.wait(2);
       userSettings.eMail.clear();
       userSettings.eMail.sendKeys("hola@gmail.com");
        userSettings.saveButton.click();
        Driver.wait(3);
        assertTrue(userSettings.succesfullyMessage.isDisplayed());
        Driver.wait(3);
    }
    @Given("user verify firstname should not be blank")
    public void user_verify_firstname_should_not_be_blank() {
  userSettings.firstName.clear();
  userSettings.saveButton.click();
  String firstNameMessage=Driver.waitAndGetText(userSettings.firstNameFeedBack,2);
assertEquals(firstNameMessage,"Your first name is required.");

    }
    @Given("user verify lastname should not be blank")
    public void user_verify_lastname_should_not_be_blank() {

        userSettings.lastName.clear();
        userSettings.saveButton.click();
        String lastNameMessage=Driver.waitAndGetText(userSettings.lastNameFeedBack,2);
        assertEquals(lastNameMessage,"Your last name is required.");



    }
    @Given("user verify e-mail should not be created without @ sign and  .com extension")
    public void user_verify_e_mail_should_not_be_created_without_sign_and_extension() {
Driver.wait(2);
        userSettings.eMail.clear();
        Driver.waitAndSendText(userSettings.eMail,"arjola.com",2);
        userSettings.saveButton.click();
        String emailMessage=Driver.waitAndGetText(userSettings.emailFeedBack,2);
        assertEquals(emailMessage,"This field is invalid");



    }








}
