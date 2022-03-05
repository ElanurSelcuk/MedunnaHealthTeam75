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

        @FindBy(id = "firstName")
        public WebElement firstNameTextBox;

        @FindBy(id = "lastName")
         public WebElement lastNameTextBox;

         @FindBy(id = "username")
         public WebElement usernameTextBox;

        @FindBy(id = "email")
        public WebElement emailTextBox;

        @FindBy(id = "firstPassword")
        public WebElement NewPasswordTextBox;

        @FindBy(id = "secondPassword")
        public WebElement NewPasswordConfirmTextBox;

         @FindBy(id="register-submit")
         public WebElement registerButton;

         @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
         public WebElement successMessageToastContainer;



    }

