package stepdefinitions;


import Pages.PasswordConfPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PasswordStepDefs {

PasswordConfPages pages = new PasswordConfPages();

    @Given("user clicks the logIn dropdown")
    public void user_clicks_the_log_in_dropdown() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_url"));
        pages.loginDropDown.click();
    }
    @Given("user clicks on the signIn button")
    public void user_clicks_on_the_sign_in_button() {
        pages.signinbtn.click();
    }
    @Given("user provides the userName as {string}")
    public void user_provides_the_user_name_as(String string) {
        pages.enterUsername.sendKeys(string);
    }
    @Given("user provides the passWord as {string}")
    public void user_provides_the_pass_word_as(String string) {
        pages.password.sendKeys(string);
    }
    @And("user clicks on the signInButton")
    public void userClicksOnTheSignInButton() {
        pages.clickSignin.click();
    }
    @Given("user clicks on user segment")
    public void user_clicks_on_user_segment() {
        pages.userProfile.click();
    }
    @Given("user clicks on Password")
    public void user_clicks_on_password() {
        pages.passwordOption.click();
    }
    @Given("user provides the currentPassword as {string}")
    public void user_provides_the_current_password_as(String string) throws InterruptedException {
        Thread.sleep(5000);
    pages.currentPassword.sendKeys(string);
    }
    @Given("user provides the newPassword as {string}")
    public void user_provides_the_new_password_as(String string)  {

        pages.newPassword.sendKeys(string);
    }
    @Given("user provides the newPasswordConfirmation as {string}")
    public void user_provides_the_new_password_confirmation_as(String string) {
        pages.confirmPassword.sendKeys(string);
    }

    @Then("user verifies password changed successfully")
    public void user_verifies_password_changed_successfully() {
        pages.passwordStrength1.isDisplayed();
}


}
