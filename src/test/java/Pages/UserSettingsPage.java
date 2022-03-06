package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingsPage {
public UserSettingsPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(id = "account-menu")
    public WebElement userSettingsIcon;

@FindBy(partialLinkText = "Settings")
    public WebElement userSettingsDropdown;

//@FindBy(xpath = "//*[@for='firstName']")
//public WebElement firstNameText;
//
//    @FindBy(xpath = "//*[@for='lastName']")
//    public WebElement lastNameText;
//
//    @FindBy(xpath = "//*[@for='email']")
//    public WebElement emailText;

    @FindBy(id="settings-title")
    public WebElement title;

 @FindBy(css= "#firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(xpath = "//*[.='Your first name is required.']")
    public WebElement firstNameFeedBack;

    @FindBy(xpath = "//*[.='Your last name is required.']")
    public WebElement lastNameFeedBack;
 @FindBy(xpath = "//*[.='This field is invalid']")
    public WebElement emailFeedBack;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement succesfullyMessage;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;
}
