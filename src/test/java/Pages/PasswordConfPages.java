package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordConfPages {
    public PasswordConfPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
    public WebElement loginDropDown;


    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signinbtn;

    @FindBy(id = "username")
    public WebElement enterUsername;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickSignin;

    @FindBy(id = "account-menu")
    public WebElement userProfile;

    @FindBy(xpath = "//*[.='Password']")
    public WebElement passwordOption;

    @FindBy(xpath = "//*[@id=\"currentPassword\"]")
    public WebElement currentPassword;

    @FindBy(xpath = "//*[@id=\"newPassword\"]")
    public WebElement newPassword;

    @FindBy(id="confirmPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(0, 255, 0)')]")
    public WebElement passwordStrength1;





}
