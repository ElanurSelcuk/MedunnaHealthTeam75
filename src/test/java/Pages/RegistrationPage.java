package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy(id ="ssn")
        public WebElement ssnTextbox;

        @FindBy(xpath = "//*[text()='Your SSN is invalid.']")
        public WebElement ssnIsInvalidText;

        @FindBy(xpath = "//*[text()='Your SSN is required.']")
        public WebElement ssnRequiredText;

        @FindBy(id = "firstName")
        public WebElement firstNameTextBox;

        @FindBy(xpath = "//*[text()='Your FirstName is required.']")
        public WebElement firstNameRequiredText;

        @FindBy(id = "lastName")
         public WebElement lastNameTextBox;

        @FindBy(xpath = "//*[text()='Your LastName is required.']")
        public WebElement lastNameRequiredText;

         @FindBy(id = "username")
         public WebElement usernameTextBox;

        @FindBy(id = "email")
        public WebElement emailTextBox;

    @FindBy(xpath = "//*[text()='New password']/following::input")
    public WebElement firstPasswordTextBox;

    @FindBy(id= "secondPassword")
    public WebElement newPasswordTextBox;

    @FindBy(id="register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')]")
    public WebElement passwordStrength3;




}

